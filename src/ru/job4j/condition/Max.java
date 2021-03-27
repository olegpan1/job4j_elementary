package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        int rsl = max(left, right);
        System.out.println(rsl);
    }
}
