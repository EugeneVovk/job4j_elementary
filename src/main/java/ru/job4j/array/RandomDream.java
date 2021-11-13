package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize;
        if (num <= prizes.length) {
            prize = prizes[--num];
        } else {
            if (num % prizes.length != 0) {
                num %= prizes.length;
                prize = prizes[--num];
            } else {
                prize = prizes[prizes.length - 1];
            }
        }
        return prize;
    }
}
