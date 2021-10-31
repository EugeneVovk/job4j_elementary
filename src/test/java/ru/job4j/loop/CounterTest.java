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

    @Test
    public void whenSumEvenNumbersFrom0To10Then30() {
        int a = 0;
        int b = 10;
        int expected = 30;
        int rsl = Counter.sumByEven(a, b);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSumEvenNumbersFrom3To8Then18() {
        int a = 3;
        int b = 8;
        int expected = 18;
        int rsl = Counter.sumByEven(a, b);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSumEvenNumbersFrom1To1Then0() {
        int a = 1;
        int b = 1;
        int expected = 0;
        int rsl = Counter.sumByEven(a, b);
        Assert.assertEquals(expected, rsl);
    }
}