package com.project.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Task 7: Try with resource, check if the resource has closed after execution
 *
 */
public class ResourceClosedExample implements AutoCloseable {
	 private boolean isClosed = false;

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		isClosed = true;  
        System.out.println("Resource has been closed.");
	}
	 public boolean isClosed() {
	        return isClosed;  // Return whether the resource is closed
	    }
	 
	 public void SquareOfEvenNumber(List<Integer> arrList) {
		 System.out.println("Numbers "+arrList);
		 List<Integer> arrListEvenNumSquare=arrList.stream().filter(number->number%2==0).map(number->number*number).collect(Collectors.toList());
			System.out.println("Square of Even Numbers from the List");
			arrListEvenNumSquare.stream().forEach(System.out::println);
	 }
	 public void SquareOfNumber(List<Integer> arrList) {
		 System.out.println("Numbers "+arrList);
			List<Integer> arrListSquare=arrList.stream().map(number->number*number).collect(Collectors.toList());
			System.out.println("Square of Numbers in the List are ");
			arrListSquare.stream().forEach(System.out::println);
	 }
public static void main(String[] args) {
	try (ResourceClosedExample resource = new ResourceClosedExample()) {
		List<Integer> arrList=Arrays.asList(7,5,2,6,4,3);
		resource.SquareOfNumber(arrList);
		resource.SquareOfEvenNumber(arrList);
		
		  System.out.println("Is Resource Closed " + resource.isClosed());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
