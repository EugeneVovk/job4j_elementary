package ru.job4j.condition;

public class HelloWorld {

    public static String checkNumber(int number) {
        String str;
        if (number % 3 == 0 && number % 5 == 0) {
            str = "Hello, World!!!";
        } else if (number % 3 == 0) {
            str = "Hello";
        } else if (number % 5 == 0) {
            str = "World";
        } else {
            str = "Operation not support";
        }
        return str;
    }
}
