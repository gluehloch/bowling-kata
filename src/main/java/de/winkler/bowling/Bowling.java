package de.winkler.bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    private List<Frame> frames = new ArrayList<Frame>();

    private Frame currentCalculationFrame;

    public Bowling() {
    }

    public boolean isFinished() {
        return ((frames.size() == 10) && (currentCalculationFrame.isFinished()));
    }

    public void roll(int... pins) {
        for (int i : pins) {
            roll(i);            
        }
    }

    /**
     * Roll the ball.
     *
     * @param pins Number of thrown pins.
     */
    public void roll(int pins) {
        if (isFinished()) {
            throw new IllegalStateException("The game has finished.");
        }

        if (currentCalculationFrame == null) {
            currentCalculationFrame = new Frame();
            frames.add(currentCalculationFrame);
        }
        
        if (!currentCalculationFrame.isFinished()) {
            // Finish this frame with last roll
            currentCalculationFrame.roll(pins);
        } else {
            // Frame is open. So make your second roll.
            currentCalculationFrame = null;
            roll(pins);
        }
    }

    /**
     * Calculate the score of the bowling game.
     *
     * @return The score of the bowler.
     */
    public int score() {
        int result = 0;
        for (Frame frame : frames) {
            if (frame.isStrike()) {
                result += 10000; // FIXME
            } else if (frame.isSpare()) {
                result += 1000; // FIXME
            } else {
                result += frame.getFirstThrow() + frame.getSecondThrow();
            }
        }
        return result;
    }

}
