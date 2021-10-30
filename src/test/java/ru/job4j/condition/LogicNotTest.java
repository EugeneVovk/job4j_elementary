package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when4ThenTrue() {
        int in = 4;
        boolean rsl = LogicNot.isEven(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when2ThenTrue() {
        int in = 2;
        boolean rsl = LogicNot.isPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when5ThenTrue() {
        int in = 5;
        boolean rsl = LogicNot.notEven(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMinus4ThenTrue() {
        int in = -4;
        boolean rsl = LogicNot.notPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when7ThenTrue() {
        int in = 7;
        boolean rsl = LogicNot.notEvenAndPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMinus6ThenTrue() {
        int in = -6;
        boolean rsl = LogicNot.evenOrNotPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, rsl);
    }
}