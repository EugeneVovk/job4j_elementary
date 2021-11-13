package ru.job4j.array;

public class WordsToText {

    public static String convert(String[] words) {
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result.trim();
    }
}
