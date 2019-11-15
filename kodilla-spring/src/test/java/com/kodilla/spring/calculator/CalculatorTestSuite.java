package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result = calculator.add(2,2);
        //Then
        Assert.assertEquals(4.0,result,1);
    }
    @Test
    public void testSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result = calculator.sub(4,2);
        //Then
        Assert.assertEquals(2,result,1);
    }
    @Test
    public void testMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result = calculator.mul(5,2);
        //Then
        Assert.assertEquals(10,result,1);
    }
    @Test
    public void testDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result = calculator.div(6,2);
        //Then
        Assert.assertEquals(3,result,1);
    }

}
