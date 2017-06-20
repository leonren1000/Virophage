# Virophage

By Max Ovsiankin & Leon Ren, 5/7/14


1. Description
   1. What does it do?
      1. Real-Time-Strategy Game
      2. NON-INFINITE Hexagonal grid
         1. Every cell can be ‘occupied’ by only one player
         2. Each cell has an energy level -- this is changed by the player, and reset when a cell is taken
         3. Energy can be transferred between cells
         4. Goal is to eliminate all of your opponent’s occupied cells
         5. At the start of the game, the map is randomly generated with several dead cells, these are colored black
      3. Player-Vs-Player combat
         1. Each player starts with occupying some number of cells
         2. Each player starts with some number of energy on every cell
         3. To take an empty cell, the player must move at least one energy to that cell
         4. >= 2 players
         5. Can choose to be multiplayer or single AI, or AI vs AI
   1. Rules?
      1. There is a hexagonal grid with 2 different players.
      2. Each player will control an army of “virophages”, or viruses that can infect other viruses.
      3. Each player will start with 7 viruses on opposite corners (northwest and southeast) of the hexagonal flat-topped grid.
      4. The objective is to eliminate all viruses of the opposing player. The detailed mechanisms of movement and “infection” are described in sections 3 - instructions.
   1. Target market?
      1. Young or middle aged users looking for some entertainment.
   1. Primary features?
      1. GUI, AI, In-Game Chat, Multiplayer over Networking
2. Instructions
   1. There is a flat topped hexagonal grid with 2 different players.
   2. Each player will control an army of “virophages”, or viruses that can infect other viruses.
   3. Each player will start of with 3 viruses on opposite (west & east) sides of the grid.
   4. Each virus occupies a cell. Every virus has an amount of energy used to move and kill other viruses.
   5. Each player starts with occupying some number of cells
   6. Each player starts with some number of energy on every cell
   7. Click on the start button to start the game
   8. Click on another grid to construct a channel between this cell and another
   9. CTRL + LMB to pan
   10. SHIFT + LMB to place green virus
3. Features List
   1. Must-Haves
      1. ‘Stupid’ AI
      2. Occupation of cells
      3. GUI
      4. Energy
      5. Dead cells
   2. Want-To-Haves
      1. ‘Smart’ AI
      2. Buildup of Energy
      3. Ability upgrades
      4. Picture on Background
   3. Stretch Features
      1. Multiplayer over a network
4. Class List
   1. Tissue - the game board
   2. Virus - a virus, which can occupy one tile at a time
   3. Player - a player, or a collection of viruses working together
   4. Cell - a tile
   5. Location
   6. Energy
   7. Dead Cell
5. Responsibility List 
   1. Main - Leon
   2. GameClient - Leon
   3. Energy System - Leon
   4. Art - Leon
   5. GUI - ALL
   6. Sounds - Leon
   7. Networking - Max
   8. AI - Max
   9. Core Gameplay - Max
