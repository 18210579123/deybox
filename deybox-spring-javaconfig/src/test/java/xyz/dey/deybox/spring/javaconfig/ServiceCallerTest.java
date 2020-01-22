package xyz.dey.deybox.spring.javaconfig;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceCallerTest {

    @Test
    public void call() {
        new ServiceCaller().call();
    }
}