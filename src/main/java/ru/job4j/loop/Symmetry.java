package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int i) {
        boolean isSymmetry = true;
        String str = String.valueOf(i);
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != str.charAt((str.length() - 1) - j)) {
                isSymmetry = false;
                break;
            }
        }
        return isSymmetry;
    }

    public static boolean check2(int i) {
        String str1 = String.valueOf(i);
        String str2 = new StringBuilder(str1).reverse().toString();
        return str2.equals(str1);
    }
}
