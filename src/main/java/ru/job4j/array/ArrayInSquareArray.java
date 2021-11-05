package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int allocation = array.length / 2 == 1 ? array.length / 2 + 1 : array.length / 2;
        int[][] rsl = new int[allocation][allocation];
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                if (size >= array.length) {
                    rsl[i][j] = 0;
                } else {
                    rsl[i][j] = array[size++];
                }
            }
        }
        return rsl;
    }
}
