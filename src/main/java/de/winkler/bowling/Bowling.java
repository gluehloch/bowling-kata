package de.winkler.bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    private List<Frame> frames = new ArrayList<Frame>();

    private Frame currentCalculationFrame;
    
    public Bowling() {
       
    }

    public boolean isFinished() {
        return (frames.size() == 10);
    }

    /**
     * Roll the ball.
     *
     * @param pins Number of thrown pins.
     */
    public void roll(int pins) {
        if (currentCalculationFrame == null) {
            currentCalculationFrame = new Frame();    
        }
        
        if (!currentCalculationFrame.isFinished()) {
            currentCalculationFrame.roll(pins);
        }
    }

}
