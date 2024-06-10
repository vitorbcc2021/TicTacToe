package client;

import tictactoe.*;

public class Main {
    public static void main(String[] args) {
        IGameFacade game = GameFacade.getInstance();

        game.startGame();
    }
}