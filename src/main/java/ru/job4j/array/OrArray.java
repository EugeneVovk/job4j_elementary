package ru.job4j.array;

/**
 * Объединение множеств это такая операция,
 * при которой в результирующее множество попадают элементы,
 * которые есть хотя бы в одном множестве.
 */
public class OrArray {

    public static int[] or(int[] left, int[] right) {
        int[] sets = OrArray.merge(left, right);
        int[] sets2;
        int size = 1;
        int length = sets.length;
        for (int i = 1; i < sets.length; i++) {
            if (sets[i] == sets[i - 1]) {
                length--;
            }
        }
        sets2 = new int[length];
        if (sets.length > 1) {
            sets2[0] = sets[0];
            for (int i = 1; i < sets.length; i++) {
                if (sets[i] != sets[i - 1]) {
                    sets2[size++] = sets[i];
                }
            }
        } else {
            sets2 = sets;
        }
        return sets2;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] sets = new int[left.length + right.length];
        int size = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sets[size++] = left[i++];
            } else {
                sets[size++] = right[j++];
            }
        }
        while (i < left.length) {
            sets[size++] = left[i++];
        }
        while (j < right.length) {
            sets[size++] = right[j++];
        }
        return sets;
    }
}
