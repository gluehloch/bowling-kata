package de.winkler.bowling;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.Fail.fail;

import org.junit.Test;

public class FrameTest {

    @Test
    public void testFrame_two_throws() {
        Frame frame = new Frame();
        frame.firstThrow(5);
        frame.secondThrow(3);
        assertThat(frame.getFirstThrow()).isEqualTo(5);
        assertThat(frame.getSecondThrow()).isEqualTo(3);
    }

    @Test
    public void testFrame_illegal_second_throw() {
        Frame frame = new Frame();
        frame.firstThrow(5);
        try {
            frame.secondThrow(6);
            fail("Expected an exception.");
        } catch (Exception ex) {
            // ok
        }

        try {
            frame.secondThrow(7);
            fail("Expected an exception.");
        } catch (Exception ex) {
            // ok
        }

        frame.secondThrow(5);
        assertThat(frame.getSecondThrow()).isEqualTo(5);
    }

    @Test
    public void testFrame_strike_illegal_second_throw() {
        Frame frame = new Frame();
        frame.firstThrow(10);
        try {
            frame.secondThrow(4);
            fail("Expected an exception.");
        } catch (Exception ex) {
            // ok
        }
    }

    @Test
    public void testFrame_is_a_strike() {
        Frame frame = new Frame();
        frame.firstThrow(10);
        assertThat(frame.isStrike()).isTrue();
    }

    @Test
    public void testFrame_is_not_a_strike() {
        Frame frame = new Frame();
        frame.firstThrow(5);
        frame.secondThrow(3);
        assertThat(frame.isStrike()).isFalse();
    }

    @Test
    public void testFrame_is_spare() {
        Frame frame = new Frame();
        frame.firstThrow(5);
        frame.secondThrow(5);
        assertThat(frame.isSpare()).isTrue();
    }

    @Test
    public void testFrame_is_not_a_spare() {
        Frame frame = new Frame();
        frame.firstThrow(5);
        frame.secondThrow(3);
        assertThat(frame.isSpare()).isFalse();
    }

}
