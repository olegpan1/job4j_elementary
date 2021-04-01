package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslInd = 0;
        int leftInd = 0;
        int rightInd = 0;
        while (leftInd < left.length || rightInd < right.length) {
            rsl[rslInd++] = (leftInd < left.length && (rightInd < right.length && right[rightInd] >= left[leftInd])
                    || rightInd == right.length) ? left[leftInd++] : right[rightInd++];
        }
        return rsl;
    }
}

