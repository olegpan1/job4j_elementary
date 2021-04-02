package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslInd = 0;
        int leftInd = 0;
        int rightInd = 0;
        while (rslInd < rsl.length) {
            if (leftInd != left.length && rightInd != right.length) {
                rsl[rslInd++] = left[leftInd] < right[rightInd] ? left[leftInd++] : right[rightInd++];
            } else if (leftInd != left.length) {
                rsl[rslInd++] = left[leftInd++];
            } else {
                rsl[rslInd++] = right[rightInd++];
            }
        }
        return rsl;
    }
}

