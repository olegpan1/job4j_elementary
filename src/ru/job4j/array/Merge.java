package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslInd = 0;
        int leftInd = 0;
        int rightInd = 0;
        while (rslInd != rsl.length) {
            rsl[rslInd++] = (rightInd == right.length) || (leftInd < left.length && right[rightInd] >= left[leftInd])
                    ? left[leftInd++] : right[rightInd++];
        }
        return rsl;
    }
}

