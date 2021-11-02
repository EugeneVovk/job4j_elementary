package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Stas Korobeinikov";
        names[2] = "Elena Kartashova";
        names[3] = "CI Bot";

        System.out.println("The length of the ages array is: " + ages.length);
        System.out.println("The length of the surname array is: " + surnames.length);
        System.out.println("The length of the prices array is: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
