package virophage.gui;

import virophage.Start;
import virophage.core.*;
import virophage.game.Game;
import virophage.game.ServerGame;
import virophage.util.GameConstants;

import javax.swing.*;

import java.awt.*;

/**
 * <code>GameClient</code> is responsible for (among other things), the GUI of the game.
 *
 * @author Leon Ren
 * @since 2014-05-6
 */
public class GameClient extends JFrame {

    public static final Dimension SIZE = new Dimension(1280, 720);
    
    private JPanel cardPanel;
    private CardLayout cardLayout;

    private LobbyScreen lobbyScreen;
    private ClientLobbyScreen clientLobbyScreen;
    GameScreen gameScreen;
    private Game game;
    
    /**
     * Constructs a GameClient.
     */
    public GameClient() {

        setTitle("virophage");
        setSize(SIZE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameScreen = new GameScreen();

        Start.log.info("Setting frame visible");
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        MenuScreen menuScreen = new MenuScreen(this);
        InstructionScreen instructionPanel = new InstructionScreen(this);
        CreditsScreen creditsPanel = new CreditsScreen(this);
        lobbyScreen = new LobbyScreen(this);
        clientLobbyScreen = new ClientLobbyScreen(this);

        cardPanel.add(menuScreen, "menuScreen");
        cardPanel.add(gameScreen, "renderTree");
        cardPanel.add(instructionPanel, "instructionScreen");
        cardPanel.add(creditsPanel, "creditsScreen");
        cardPanel.add(lobbyScreen, "lobbyScreen");
        cardPanel.add(clientLobbyScreen, "clientLobbyScreen");

        add(cardPanel);

        setVisible(true);
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    /**
     * Changes the Panel.
     *
     * @param s the panel to change to.
     */
    public void changePanel(String s) {
        cardLayout.show(cardPanel, s);
        requestFocus();
    }
    
    public Game getGame() {
    	return game;
    }

    public ClientLobbyScreen getClientLobbyScreen() {
        return clientLobbyScreen;
    }

}
