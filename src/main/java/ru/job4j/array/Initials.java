package ru.job4j.array;

public class Initials {

    public static String convert(String[] fio) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fio.length; i++) {
            if (i > 0) {
                char letter = fio[i].charAt(0);
                sb.append(letter).append(".");
            } else {
                sb.append(fio[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
