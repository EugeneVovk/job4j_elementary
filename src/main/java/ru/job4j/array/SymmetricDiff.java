package ru.job4j.array;

import java.util.Arrays;

/**
 * Симметрическая разность - это такая операция, когда в результирующее множество
 * попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.
 */
public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int length = 0;
        int[] sets = new int[left.length + right.length];
        for (int i : left) {
            boolean isTrue = false;
            for (int j : right) {
                if (i == j) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                sets[length++] = i;
            }
        }
        for (int i : right) {
            boolean isTrue = false;
            for (int j : left) {
                if (i == j) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                sets[length++] = i;
            }
        }
        return Arrays.copyOf(sets, length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{1}, new int[]{})));
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{}, new int[]{1})));
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{1}, new int[]{1})));
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{1, 2}, new int[]{2, 3})));
        System.out.println(Arrays.toString(SymmetricDiff.diff(new int[]{1, 2}, new int[]{3, 4})));
    }
}
