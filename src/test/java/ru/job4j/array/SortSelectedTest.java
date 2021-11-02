package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortWith5Numbers() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortWith3Numbers() {
        int[] data = {54, 0, 7};
        int[] rst = SortSelected.sort(data);
        int[] expected = {0, 7, 54};
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void whenSortWith9Numbers() {
        int[] data = new int[]{65, 8, 2, 0, 0, 56, 9, 7, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 0, 2, 7, 7, 8, 9, 56, 65};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortWith4Numbers() {
        int[] data = {0, 1, 3, 4};
        int[] rst = SortSelected.sort(data);
        int[] expected = {0, 1, 3, 4};
        Assert.assertArrayEquals(expected, rst);
    }

}