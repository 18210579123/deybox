package xyz.dey.deybox.java.enumdemo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductWithCodeTest {

    @Test
    public void getCode() {
        Assert.assertSame(ProductWithCode.WINDOWS, ProductWithCode.valueOf("WINDOWS"));

        Assert.assertSame(ProductWithCode.WINDOWS.getCode(), "win");
        Assert.assertSame(ProductWithCode.OFFICE.getCode(), "off");
        Assert.assertSame(ProductWithCode.AOE.getCode(), "aoe");
    }
}