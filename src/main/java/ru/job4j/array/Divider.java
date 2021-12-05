package ru.job4j.array;

/**
 * Метод принимает два параметра:
 * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints,
 * делителями числа num, если являются - то метод должен вернуть true.
 * Делитель – это число, на которое другое число делится без остатка.
 */
public class Divider {

    public static boolean check(int num, int[] ints) {
        for (int i : ints) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
