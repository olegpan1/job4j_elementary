package ru.job4j.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1, 5},
                {3, 5, 6}
        };
        for (int[] ints : array) {
            for (int cell = 0; cell < array.length; cell++) {
                int val = ints[cell];
                System.out.println(val);
            }
        }
    }
}