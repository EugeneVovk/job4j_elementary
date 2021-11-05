package ru.job4j.array;

public class SumWithStopEl {

    public static int count(int[] data, int el) {
        int count = 0;
        for (int datum : data) {
            if (datum != el) {
                count += datum;
            } else {
                if (count % 2 != 0) {
                    count = 0;
                }
                break;
            }
        }
        return count;
    }
}
