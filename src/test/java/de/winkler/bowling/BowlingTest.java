package de.winkler.bowling;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.Fail.fail;

import org.junit.Test;

public class BowlingTest {

    @Test
    public void testBowling() {
        Bowling bowling = new Bowling();

        // First round
        bowling.roll(1);
        bowling.roll(2);
        
        // Second round
        bowling.roll(3);
        bowling.roll(4);
        
        // Third round
        bowling.roll(2);
        bowling.roll(3);
        
        // Forth round
        bowling.roll(4);
        bowling.roll(4);
        
        // Fifth round
        bowling.roll(2);
        bowling.roll(7);

        // 6. round
        bowling.roll(1);
        bowling.roll(1);

        // 7. round
        bowling.roll(2);
        bowling.roll(2);
        
        // 8. round
        bowling.roll(2);
        bowling.roll(2);

        // 9. round
        bowling.roll(2);
        bowling.roll(2);

        // 10. round
        bowling.roll(4);
        bowling.roll(4);

        assertThat(bowling.isFinished()).isTrue();
    }

}
