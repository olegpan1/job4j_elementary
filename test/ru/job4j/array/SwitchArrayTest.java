package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void swap0To3() {
        int[] test = new int[]{9, 8, 7, 6, 5, 4, 3};
        int source = test.length - 2;
        int dest = 0;
        int[] rsl = SwitchArray.swap(test, source, dest);
        int[] expected = new int[]{4, 8, 7, 6, 5, 9, 3};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void swap5To6() {
        int[] test = new int[]{9, 8, 7, 6, 5, 4, 3};
        int source = test.length - 2;
        int dest = test.length - 1;
        int[] rsl = SwitchArray.swap(test, source, dest);
        int[] expected = new int[]{9, 8, 7, 6, 5, 3, 4};
        Assert.assertArrayEquals(expected, rsl);
    }

}