package com.jiawa.java11;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author panguanjing 2019-01-07
 **/
public class StringDemoTest {

    @Test
    public void testStringStrip() {
        String text = "  \u2000a  b  ";
        Assert.assertEquals("a  b", text.strip());
        Assert.assertEquals("\u2000a  b", text.trim());
        Assert.assertEquals("a  b  ", text.stripLeading());
        Assert.assertEquals("  \u2000a  b", text.stripTrailing());
    }
}
