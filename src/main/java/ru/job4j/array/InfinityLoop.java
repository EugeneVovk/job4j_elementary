package ru.job4j.array;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("infinity");
            i -= 1;
        }
    }
}
