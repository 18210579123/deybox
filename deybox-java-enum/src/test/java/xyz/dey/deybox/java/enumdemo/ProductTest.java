package xyz.dey.deybox.java.enumdemo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void toStringTest(){
        assertTrue(Product.WINDOWS.toString().equals("WINDOWS"));
        //这样的写法实际可以写为assertEquals

        //比较两个Enum，可以直接用==去比较
        assertTrue(Product.WINDOWS == Product.WINDOWS);
        //这样的写法实际可以写为 assertSame

        assertEquals(Product.WINDOWS, Product.WINDOWS);

        assertTrue(Product.WINDOWS instanceof Product);
        assertSame(Product.WINDOWS.getClass(), Product.OFFICE.getClass());

        //一个类的toString方法前面会有class
        assertEquals(Product.WINDOWS.getClass().toString(), "class xyz.dey.deybox.java.enumdemo.Product");
        assertEquals(Product.WINDOWS.getClass(), Product.class);
    }

    @Test
    public void ValueOfTest(){
        Product windows = Product.valueOf("WINDOWS");
        assertSame(windows, Product.WINDOWS);
    }

    @Test
    public void testSuperClass(){
        //所有的enum的父类都是java.lang.Enum
        assertSame(Product.WINDOWS.getClass().getSuperclass(), Enum.class);

        //Enum的valueOf方法和Product的方法，差别只是一个参数
        assertSame(Enum.valueOf(Product.class,"WINDOWS"),Product.valueOf("WINDOWS"));

        //enum可以用父类的values()方法转化为一个数组
        Product[] products = Product.values();
        for(int i=0; i<products.length; i++){
            System.out.println(products[i]);
        }

        //ordinal返回枚举常量在enum中定义的位置
        Assert.assertEquals(0, Product.WINDOWS.ordinal());
        Assert.assertEquals(1, Product.OFFICE.ordinal());
        Assert.assertEquals(2, Product.AOE.ordinal());
    }

}