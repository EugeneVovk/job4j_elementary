package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data[0].length];
        int size = 0;
        int sumOfIdx = 1;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    rsl[size++] = 0;
                } else {
                    rsl[size++] = data[i][j];
                }
            }
        }
        for (int j : rsl) {
            if (j != 0) {
                sumOfIdx++;
            } else {
                compress(rsl);
            }
        }
        return Arrays.copyOf(rsl, sumOfIdx);
    }

    public static void compress(int[] rsl) {
        for (int k = 0; k < rsl.length; k++) {
            if (rsl[k] == 0) {
                for (int j = k + 1; j < rsl.length; j++) {
                    if (rsl[j] != 0) {
                        int temp = rsl[k];
                        rsl[k] = rsl[j];
                        rsl[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}
