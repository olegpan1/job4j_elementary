package ru.job4j.stepik;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int dayUp = scanner.nextInt();
        int nightDown = scanner.nextInt();
        int day = 1;
        height -= dayUp;
        while (height > 0) {
            height = height + nightDown - dayUp;
            day++;
        }
        System.out.print(day);
    }
}
