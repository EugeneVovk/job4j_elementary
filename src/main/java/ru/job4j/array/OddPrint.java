package ru.job4j.array;

public class OddPrint {

    public static void print(int[] array) {
        for (int el : array) {
            if (el % 2 != 0) {
                System.out.println(el);
            }
        }
    }
}
