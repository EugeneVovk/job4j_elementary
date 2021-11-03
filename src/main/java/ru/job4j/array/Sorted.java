package ru.job4j.array;

public class Sorted {

    public static boolean isSorted(int[] array) {
        boolean rst = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    rst = false;
                    break;
                }
            }
        }
        return rst;
    }
}
