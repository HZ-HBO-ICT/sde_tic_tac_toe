package com.hz.players;

public class DummyPlayer implements TicTacToe {

    private int symbol;

    private int[] state;

    @Override
    public String getPlayerName() {
        return "Player Dummy";
    }

    @Override
    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public int getSymbol() { return this.symbol; }

    @Override
    public void accept(int[] state) {

        this.state = state;
    }

    @Override
    public void setNewState() {

        // 'First comes, first served' algorithm
        for(int i=0; i<9; i++) {
            int value = this.state[i];

            if(value == -1) {
                this.state[i] = this.symbol;
                break;
            }
        }
    }

    @Override
    public int[] getChangedState() {
        return this.state;
    }
}
