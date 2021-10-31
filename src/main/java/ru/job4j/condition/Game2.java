package ru.job4j.condition;

public class Game2 {

    public static int checkGame(double percent, int prize, int pay) {
        int difference = 0;
        double sum = percent * prize;
        if (sum > pay) {
            difference = (int) (sum - pay);
        }
        return difference;
    }
}
