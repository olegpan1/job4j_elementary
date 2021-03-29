package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (boolean mono : data
        ) {
            if (mono != data[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
