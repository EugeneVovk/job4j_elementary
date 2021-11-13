package ru.job4j.array;

/**
 * Разность множеств это операция при которой в результирующее множество
 * попадают элементы из первого множества, но только если их нет во втором множестве.
 */
public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int length = 0;
        int[] sets;
        int size = 0;
        for (int i : left) {
            for (int j : right) {
                if (i != j) {
                    length++;
                }
            }
        }
        sets = new int[length];
        if (left.length > 1) {
            for (int i : left) {
                for (int j : right) {
                    if (i != j) {
                        sets[size++] = i;
                    }
                }
            }
        } else {
            sets = left;
        }
        return sets;
    }
}
