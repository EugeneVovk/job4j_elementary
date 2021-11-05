package ru.job4j.array;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int count = 0;
        int size = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        for (int datum : data) {
            if (datum % 2 != 0) {
                oddArray[size++] = datum;
            }
        }
        return oddArray;
    }
}
