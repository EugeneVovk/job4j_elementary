package ru.job4j.array;

public class SquareArray {

    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = num++;
                System.out.println(array[i][j]);
            }
        }
    }
}
