package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < left.length && k < right.length) {
            if (right[k] <= left[j]) {
                rsl[i] = right[k];
                k++;
            } else {
                if (left[j] <= right[k]) {
                    rsl[i] = left[j];
                    j++;
                }
            }
            i++;
        }

        while (i < rsl.length) {
            if (k < right.length) {
                rsl[i] = right[k];
                k++;
                i++;
            } else {
                if (j < left.length) {
                    rsl[i] = left[j];
                    j++;
                    i++;
                }
            }
        }
        return rsl;
    }
}

