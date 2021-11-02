package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean rst = EqLast.check(left, right);
        Assert.assertTrue(rst);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 6};
        boolean rst = EqLast.check(left, right);
        Assert.assertFalse(rst);
    }
}