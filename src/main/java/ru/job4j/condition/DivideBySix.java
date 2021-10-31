package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl = "Исходное число не делится на 3 и не является чётным.";
        if (number % 6 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является чётным.";
        } else if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является чётным.";
        }
        return rsl;
    }
}
