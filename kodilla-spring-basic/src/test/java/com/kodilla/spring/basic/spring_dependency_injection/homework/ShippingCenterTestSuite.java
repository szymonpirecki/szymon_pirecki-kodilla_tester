package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {

    private String contextAddress = "com.kodilla.spring.basic.spring_dependency_injection";

    @Test
    public void shouldReturnCorrectNotification(){
        ApplicationContext context = new AnnotationConfigApplicationContext(contextAddress);
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notification = bean.sendPackage("address", 1);
        Assertions.assertNotNull(notification);
    }

    @Test
    public void shouldCheckThePackageAndReturnConfirmationIfWeightIsOK(){
        ApplicationContext context = new AnnotationConfigApplicationContext(contextAddress);
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expected = bean.sendPackage("test", 29);
        Assertions.assertEquals("Package delivered to: test", expected);
    }

    @Test
    public void shouldCheckThePackageAndReturnFailureIfWeightIsNotOK(){
        ApplicationContext context = new AnnotationConfigApplicationContext(contextAddress);
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expected = bean.sendPackage("test", 31);
        Assertions.assertEquals("Package not delivered to: test", expected);
    }


}