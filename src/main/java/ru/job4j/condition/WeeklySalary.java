package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int sumWeekDays = 0;
        int extraHours = 0;
        int sumWeekends = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8) {
                extraHours += (hours[i] - 8);
                sumWeekDays += 8;
            } else {
                sumWeekDays += hours[i];
            }
        }
        for (int i = 5; i < hours.length; i++) {
            if (hours[i] > 8) {
                sumWeekends += ((hours[i] - 8) * 15);
                sumWeekends += (8 * 10);
            } else {
                sumWeekends += (hours[i] * 10);
            }
        }
        return (sumWeekDays * 10) + (extraHours * 15) + (sumWeekends * 2);
    }
}
