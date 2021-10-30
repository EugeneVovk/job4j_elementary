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

    public static void main(String[] args) {
        int rsl = ThreeMax.max(16, 16, 6);
        System.out.println(rsl);
    }
}
