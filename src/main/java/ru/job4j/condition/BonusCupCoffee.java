package ru.job4j.condition;

public class BonusCupCoffee {

    public static int countCup(int count, int n) {
        int bonus = 0;
        if (count > n) {
            bonus = count / n;
        }
        return bonus + count;
    }
}
