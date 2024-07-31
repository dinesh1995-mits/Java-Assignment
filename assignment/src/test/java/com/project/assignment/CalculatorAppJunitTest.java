package com.project.assignment;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Task 1: create a basic junit test
 */

public class CalculatorAppJunitTest

{
	static int num1=0;
	static int num2=0;
	@BeforeAll
	public static void init() {
		System.out.println("JUnit Testing For Calculator Class ");
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter number 1 : ");
		 * num1=sc.nextInt(); System.out.println("Enter number 2 : ");
		 * num2=sc.nextInt();
		 */
		num1=10;
		num2=2;
		}
	
	@Test
	public void addTest() {
		System.out.println("Add method Testing Using JUnit executed");
		int actualResult=CalculatorAppJunit.add(num1, num2);
		int exceptedResult=num1+num2;
		Assertions.assertEquals(actualResult, exceptedResult,"Excepted Result not match with Actual Result ");
	}
	
	@Test
	public void subtractTest() {
		System.out.println("Minus method Testing Using JUnit executed");
	
		int actualResult=CalculatorAppJunit.minus(num1, num2);
		int exceptedResult=num1-num2;
		Assertions.assertEquals(actualResult, exceptedResult,"Excepted Result not match with Actual Result ");
	}
	
	@Test
	public void MultiplyTest() {
		System.out.println("Minus method Testing Using JUnit executed");
		int actualResult=CalculatorAppJunit.multiply(num1, num2);
		int exceptedResult=num1*num2;
		Assertions.assertEquals(actualResult, exceptedResult,"Excepted Result not match with Actual Result ");
	}
	@Test
	public void divideTest() {
		System.out.println("Divide method Testing Using JUnit executed");
		Assertions.assertFalse(isEqualToZero(num2), "num2 should not equal to Zero");
		int actualResult=CalculatorAppJunit.divide(num1, num2);
		int exceptedResult=num1/num2;
		Assertions.assertEquals(actualResult, exceptedResult,"Excepted Result not match with Actual Result ");
	}
	public static boolean isEqualToZero(int b) {
        return b==0;
    }
	@AfterAll
	public static void clear() {
		System.out.println("JUnit Testing Done!!!");
		num1=0;
		num2=0;
	}

}
