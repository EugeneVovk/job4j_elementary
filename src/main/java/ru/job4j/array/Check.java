package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean isSame = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
}
