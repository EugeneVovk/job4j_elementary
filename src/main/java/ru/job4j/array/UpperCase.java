package ru.job4j.array;

public class UpperCase {

    public static char[] toUpperCase(char[] string) {
        char[] chars = new char[string.length];
        int size = 0;
        for (char ch : string) {
            if (Character.isLetter(ch)) {
                chars[size++] = Character.toUpperCase(ch);
            } else {
                chars[size++] = ch;
            }
        }
        return chars;
    }
}
