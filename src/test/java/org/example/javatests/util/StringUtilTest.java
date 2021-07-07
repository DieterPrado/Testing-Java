package org.example.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeatOnce() {


        String result = StringUtil.repeat("hola", 3);
        Assert.assertEquals("holaholahola", result);

    }
    @Test
    public void testRepeatMultimpleTimes() {
        String result2 = StringUtil.repeat("hola", 1 );
        Assert.assertEquals("hola", result2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatZeroTimes() {
        String result3 = StringUtil.repeat("hola", -1 );
        Assert.assertEquals("", result3);
    }
}