package ru.job4j.array;

/**
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например:
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4} *
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */
public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    /* метод делает сдвиг с шагом 1 */
    public static void shift(int[] nums) {
        int size = nums.length;
        int tmp = nums[size - 1];
        for (int i = size - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = tmp;
    }
}
