package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {

    @Test
    public void monoTrue1() {
        boolean[] data = new boolean[]{true, true, true};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void monoTrue2() {
        boolean[] data = new boolean[]{false, false, false};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void monoFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean rsl = Check.mono(data);
        Assert.assertFalse(rsl);
    }
}