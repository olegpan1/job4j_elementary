package ru.job4j.stepik;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter an odd number:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[][] matrix = new String[size][size];

        int middle = size / 2;
        for (int row = 0; row <= middle; row++) {
            for (int col = 0; col <= middle; col++) {
                if (row == col || col == size - row - 1 || row == middle || col == middle) {
                    matrix[row][col] = "*";
                    matrix[row][size - col - 1] = "*";
                } else {
                    matrix[row][col] = ".";
                    matrix[row][size - col - 1] = ".";
                }
            }
            matrix[size - row - 1] = matrix[row];
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
