package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {

    public static int[] resolve(int number) {
        int count = 0;
        int tmp = number;
        while (tmp != 0) {
            tmp /= 10;
            count++;
        }
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
}
