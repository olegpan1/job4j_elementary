package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int rsl = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int rsl = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(expected, rsl);
    }

}