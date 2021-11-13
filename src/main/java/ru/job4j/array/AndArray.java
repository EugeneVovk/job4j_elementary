package ru.job4j.array;

/**
 * Множество - это набор уникальных элементов.
 * Пересечение множеств - это такая операция,
 * когда в результирующее множество попадают только элементы,
 * которые есть в обоих множествах. Если нет такие элементов,
 * то результат пустое множество.
 * <p>
 * Ваша задача реализовать данную операцию в коде. Множества заданы массивами
 */
public class AndArray {

    public static int[] and(int[] left, int[] right) {
        int size = 0;
        int length = 0;
        int[] sets;
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    length++;
                }
            }
        }
        sets = new int[length];
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    sets[size++] = i;
                }
            }
        }
        return sets;
    }
}
