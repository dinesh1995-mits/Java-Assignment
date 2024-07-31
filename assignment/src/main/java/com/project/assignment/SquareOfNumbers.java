package com.project.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Task 5: Given a list of numbers find square of each number using streams
 *
 */
public class SquareOfNumbers {
	public static void main(String[] args) {
		List<Integer> arrList=Arrays.asList(7,5,2,6,4,3);
		System.out.println("Numbers "+arrList);
		List<Integer> arrListSquare=arrList.stream().map(number->number*number).collect(Collectors.toList());
		System.out.println("Square of Numbers in the List are ");
		arrListSquare.stream().forEach(System.out::println);
		
		
		
	}

}
