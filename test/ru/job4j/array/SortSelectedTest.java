package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {4, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort8() {
        int[] data = new int[] {8, 6, 7, 3, 4, 1, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

}