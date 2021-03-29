package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 3, 23, 7};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHas2ThenNone() {
        int[] data = new int[]{5, 3, 23, 7};
        int el = 2;
        int rsl = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHasMinus1Then2() {
        int[] data = new int[]{0, 4, -1, 5, 3, -1, 23, 7};
        int el = -1;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

}