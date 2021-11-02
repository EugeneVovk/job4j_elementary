package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] rst = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {56, 8, 41, 3, 98};
        int source = 1;
        int dest = 2;
        int[] rst = SwitchArray.swap(input, source, dest);
        int[] expected = {56, 41, 8, 3, 98};
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void whenSwap3To3() {
        int[] input = {5, 48, 6, 32, 1, 22};
        int source = 3;
        int dest = 3;
        int[] rst = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 48, 6, 32, 1, 22};
        Assert.assertArrayEquals(expected, rst);
    }
}