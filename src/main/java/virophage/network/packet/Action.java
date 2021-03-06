package virophage.network.packet;

import virophage.core.Player;
import virophage.network.TissueSegment;

/**
 * Represents a Player action.
 *
 * @author Max Ovsiankin
 * @since 2014-05-17
 */
public class Action implements Packet {

    private Player player;

    public Action(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
