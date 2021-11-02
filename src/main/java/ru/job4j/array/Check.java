package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean isSame = true;
        for (boolean idx : data) {
            if (data[0] != idx) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
}
