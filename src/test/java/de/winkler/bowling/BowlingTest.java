package de.winkler.bowling;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class BowlingTest {

    @Test
    public void testBowling_with_a_spare() {
        Bowling bowling = new Bowling();
    }

    @Test
    public void testBowling_with_shortcut_method() {
        Bowling bowling = new Bowling();
        bowling.roll(1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9, 0, 1, 1);
        assertThat(bowling.isFinished()).isTrue();
        assertThat(bowling.score()).isEqualTo(55);
    }

    @Test
    public void testBowling_without_a_strike() {
        Bowling bowling = new Bowling();

        // First round
        bowling.roll(1);
        bowling.roll(2); // 3
        
        // Second round
        bowling.roll(3);
        bowling.roll(4); // 7
        
        // Third round
        bowling.roll(2);
        bowling.roll(3); // 5
        
        // Forth round
        bowling.roll(4);
        bowling.roll(4); // 8
        
        // Fifth round
        bowling.roll(2);
        bowling.roll(7); // 9

        // 6. round
        bowling.roll(1);
        bowling.roll(1); // 2

        // 7. round
        bowling.roll(2);
        bowling.roll(2); // 4
        
        // 8. round
        bowling.roll(2);
        bowling.roll(2); // 4

        // 9. round
        bowling.roll(2);
        bowling.roll(2); // 4

        // 10. round
        bowling.roll(4);
        bowling.roll(4); // 8

        assertThat(bowling.isFinished()).isTrue();
        assertThat(bowling.score()).isEqualTo(54);
    }

}
