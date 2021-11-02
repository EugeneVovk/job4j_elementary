package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, rst);
    }
}