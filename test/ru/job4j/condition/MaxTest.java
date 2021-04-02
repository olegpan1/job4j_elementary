package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void when4Then8() {
        int first = 5;
        int second = 7;
        int third = 8;
        int fourth = 2;
        int rsl = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when3Then9() {
        int first = 9;
        int second = 7;
        int third = 8;
        int rsl = Max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when2Then4() {
        int first = 3;
        int second = 5;
        int rsl = Max.max(first, second);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }

}