package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(123456321);
        assertThat(check, is(false));
    }

    @Test
    public void checkTrue2() {
        boolean check = Symmetry.check2(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse2() {
        boolean check = Symmetry.check2(123456321);
        assertThat(check, is(false));
    }
}