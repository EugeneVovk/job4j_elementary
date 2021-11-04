package ru.job4j.array;

public class MergeRows {

    public static int[] merge(int[][] data) {
        int size = 0;
        int[] array = new int[data.length * data[0].length];
        for (int[] datum : data) {
            for (int i : datum) {
                array[size++] = i;
            }
        }
        return array;
    }
}
