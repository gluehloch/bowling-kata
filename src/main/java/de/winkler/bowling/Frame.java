package de.winkler.bowling;

public class Frame {

    private int firstThrow = 0;
    private int secondThrow = 0;

    public Frame() {   
    }

    public void firstThrow(int pins) {
        firstThrow = pins;
    }

    public void secondThrow(int pins) {
        if (firstThrow == 10) {
            throw new IllegalStateException();
        }
        int lastPins = 10 - firstThrow;

        if (pins > lastPins) {
            throw new IllegalStateException();
        }
        secondThrow = pins;
    }

    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }

    public boolean isStrike() {
        return firstThrow == 10;
    }

    public boolean isSpare() {
        return ((firstThrow + secondThrow) == 10);
    }

    public boolean isMiss() {
        return ((firstThrow + secondThrow) == 0);
    }

}
