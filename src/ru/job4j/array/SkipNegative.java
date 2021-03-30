package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        int skip = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = skip;
                }
            }
        }
        return array;
    }
}
