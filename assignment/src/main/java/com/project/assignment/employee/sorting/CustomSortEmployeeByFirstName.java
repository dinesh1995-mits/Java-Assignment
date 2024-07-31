package com.project.assignment.employee.sorting;
/**
 * Task 4: Above Employee pojo in a treeset
 define custom sorting based on firstname only

 *
 */
import java.util.Comparator;
import java.util.TreeSet;

public class CustomSortEmployeeByFirstName implements Comparator<Employee>{
	@Override
    public int compare(Employee emp1, Employee emp2) {
     
        return emp1.getFirstName().compareTo(emp2.getFirstName());
    }
	public static void main(String[] args) {
		  TreeSet<Employee> empSet = new TreeSet<>(new CustomSortEmployeeByFirstName());

	      // Adding employees
	      empSet.add(new Employee(2, "Rohit", "Sharma"));
	      empSet.add(new Employee(3, "Hardik", "Pandya"));
	      empSet.add(new Employee(1, "Sanchin", "Tendulker"));
	      empSet.add(new Employee(4, "Virat", "Kohli"));
	      empSet.add(new Employee(5, "MS", "Dhoni"));
	      //Sort by firstName using Comparator
	      empSet.stream().forEach(System.out::println);
	}
	
}
