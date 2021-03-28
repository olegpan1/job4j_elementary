package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < 7; i++) {
            while (i < 5) {
                if (hours[i] <= 8) {
                    rsl += hours[i] * 10;
                } else {
                    rsl += 8 * 10 + (hours[i] - 8) * 15;
                }
                break;
            }
            while (i >= 5) {
                if (hours[i] <= 8) {
                    rsl += hours[i] * 20;
                } else {
                    rsl += 8 * 20 + (hours[i] - 8) * 30;
                }
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(hours));
    }
}
