package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int rsl = first;
        if (first < second && second > third) {
            rsl = second;
        }
        if (third > first && second <= third) {
            rsl = third;
        }
        return rsl;
    }
}
