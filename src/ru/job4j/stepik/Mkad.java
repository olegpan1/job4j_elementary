package ru.job4j.stepik;

import java.util.Scanner;

class Mkad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int hour = scanner.nextInt();
        int result = 0;
        if (speed >= 0) {
            result = (speed * hour) % 109;
        } else {
            if ((speed * hour) % 109 != 0) {
                result = 109 + (speed * hour) % 109;
            }
        }
        System.out.println(result);
    }
}
