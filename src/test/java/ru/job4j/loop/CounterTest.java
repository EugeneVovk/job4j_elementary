package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void when0To10Then55() {
        int a = 0;
        int b = 10;
        int expected = 55;
        int rsl = Counter.sum(a, b);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when3To8Then33() {
        int a = 3;
        int b = 8;
        int expected = 33;
        int rsl = Counter.sum(a, b);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when1To1Then1() {
        int a = 1;
        int b = 1;
        int expected = 1;
        int rsl = Counter.sum(a, b);
        Assert.assertEquals(expected, rsl);
    }
}