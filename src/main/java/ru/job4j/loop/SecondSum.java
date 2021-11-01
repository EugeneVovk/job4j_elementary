package ru.job4j.loop;

public class SecondSum {

    public static int sum(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i += 2) {
            count += i;
        }
        return count;
    }
}
