package ru.job4j.array;

import java.util.Arrays;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {

        int[] arr = new int[2 + middle.length / 2 + right.length / 2];

        arr[0] = left[0];
        arr[arr.length - 1] = left[left.length - 1];

        for (int i = 0; i < middle.length; i++) {
            for (int j = 2; j < arr.length - 1; j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    arr[j] = middle[i];
                }
            }
        }

        for (int i = 0; i < right.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    arr[j] = right[i];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};

        System.out.println(Arrays.toString(union(left, middle, right)));
    }
}
