package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return sum(subtraction(first, second), division(first, second));
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(sumAndMultiply(first, second), sumOfSubtractionAndDivision(first, second));
    }

    public static void main(String[] args) {
        double first = 4;
        double second = 2;
        System.out.println("Результат расчёта равен: " + sumAndMultiply(first, second));
        System.out.println("Результат расчёта равен: " + sumOfSubtractionAndDivision(first, second));
        System.out.println("Результат расчёта равен: " + sumOfAllOperations(first, second));
    }
}
