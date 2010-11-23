package de.winkler.bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    private List<Frame> frames = new ArrayList<Frame>();

    private Frame currentCalculationFrame;
    
    public Bowling() {
       
    }

    public int score(Frame frame) {
        int score = 0;
        if (frame.isStrike()) {
            int indexCurrentFrame = frames.indexOf(frame);
            
        }

        return score;
    }

}
