package ru.job4j.array;

public class SwapRows {

    public static void swap(int[][] data, int src, int dst) {
        int[] array1 = data[src];
        int[] array2 = data[dst];
        data[src] = array2;
        data[dst] = array1;
    }
}
