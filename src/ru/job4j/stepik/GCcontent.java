package ru.job4j.stepik;

import java.util.Scanner;

class GCcontent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        String list = "cCgG";
        double count = 0;
        for (char ch : chars) {
            if (list.contains(ch + "")) {
                count++;
            }
        }
        System.out.println(count / chars.length * 100);
    }
}
