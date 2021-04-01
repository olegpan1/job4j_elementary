package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        if (left.length <= right.length) {
            while (j < left.length) {
                if (k < right.length && right[k] <= left[j]) {
                    rsl[i] = right[k];
                    k++;
                } else {
                    rsl[i] = left[j];
                    j++;
                }
                i++;
            }
            while (i < rsl.length) {
                rsl[i] = right[k];
                k++;
                i++;
            }
        } else {
            while (k < right.length) {
                if (j < left.length && left[j] <= right[k]) {
                    rsl[i] = left[j];
                    j++;
                } else {
                    rsl[i] = right[k];
                    k++;
                }
                i++;
            }
            while (i < rsl.length) {
                rsl[i] = left[j];
                j++;
                i++;
            }
        }
        return rsl;
    }
}

