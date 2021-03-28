package ru.job4j.loop;

import org.junit.Test;

import  org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);
    }
}