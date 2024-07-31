package com.project.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Task 6: Given a list of numbers find square of all even numbers using streams
 *
 */
public class SquareOfEvenNumbers {
public static void main(String[] args) {
	List<Integer> arrList=Arrays.asList(7,5,2,6,4,3);
	System.out.println("Numbers "+arrList);
	List<Integer> arrListEvenNumSquare=arrList.stream().filter(number->number%2==0).map(number->number*number).collect(Collectors.toList());
	System.out.println("Square of Even Numbers from the List");
	arrListEvenNumSquare.stream().forEach(System.out::println);
}
}
