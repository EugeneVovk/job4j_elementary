package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left[0].length];
        int size = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                rsl[size++] = Math.max(left[i][j], right[i][j]);
            }
        }
        return rsl;
    }
}
