package com.hz;

import com.hz.players.*;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = new GameEngine();

        // player 1
        TicTacToe playerOne = new Pascal();

        playerOne.setSymbol(0);

        // player 2
        TicTacToe playerTwo = new DummyPlayer();
        playerOne.setSymbol(1);

        // Strategy Design Pattern
        engine.setPlayerOne(playerOne);
        engine.setPlayerTwo(playerTwo);

        engine.startGame();
    }
}
