package com.project.assignment;

/**
 * Task 1: create a basic junit test
 *
 */
public class CalculatorAppJunit 
{

	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int divide(int a,int b) {
		return a/b;
	}
	public static int minus(int a,int b) {
		return a-b;
	}
	

    public static void main( String[] args )
    {
    	int sum=add(4,5);
		System.out.println("add method::  "+sum);
		System.out.println("test::  "+(2/99));


    }
}
