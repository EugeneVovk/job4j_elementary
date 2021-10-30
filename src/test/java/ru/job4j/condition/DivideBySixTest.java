package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является чётным.";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, но является чётным.";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является чётным.";
        Assert.assertEquals(expected, rsl);
    }
}