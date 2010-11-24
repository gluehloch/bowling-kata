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
            currentCalculationFrame.roll(pins);
        } else {
            currentCalculationFrame = null;
            roll(pins);
        }
    }

}
