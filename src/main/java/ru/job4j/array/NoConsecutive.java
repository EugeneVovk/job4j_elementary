package ru.job4j.array;

import java.util.Arrays;

/**
 * Дана возрастающая последовательность чисел.
 * Ваша задача проверить, что все числа идут один за другим,
 * т.е. разница между соседними числами по модулю равно 1.
 * Если это условие нарушается, то вам нужно вернуть число,
 * которое идет вторым при нарушении.
 * В противном случае вернуть -1.
 * Например:
 * {1, 2, 3} => -1
 * {1, 3} => 3
 */
public class NoConsecutive {
    public static int find(int[] data) {
        int rsl = -1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] - data[i - 1] != 1) {
                return data[i];
            }
        }
        return rsl;
    }
}
