package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int rst = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenArrayHas7Then4() {
        int[] data = {45, 65, 9, 91, 7, 100};
        int el = 7;
        int rst = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenArrayHas4ThenMinus1() {
        int[] data = {1, 2, 3, 5, 6, 7, 8, 9};
        int el = 4;
        int rst = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int el = 3;
        int start = 3;
        int finish = data.length - 1;
        int rst = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenFind0() {
        int[] data = {8, 56, 1, 2, 0, 0, 99};
        int el = 8;
        int start = 0;
        int finish = data.length / 2;
        int rst = FindLoop.indexOf(data, el, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenFind4() {
        int[] data = {8, 0, 0, 2, 0, 0, 99};
        int el = 0;
        int start = data.length / 2;
        int finish = data.length - 1;
        int rst = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, rst);
    }
}