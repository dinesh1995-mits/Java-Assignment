package com.project.assignment.employee.sorting;
import java.util.TreeSet;

public class SortEmployeeByDefault {
public static void main(String[] args) {
	  TreeSet<Employee> empSet = new TreeSet<>();

      // Adding employees
      empSet.add(new Employee(2, "Rohit", "Sharma"));
      empSet.add(new Employee(3, "Hardik", "Pandya"));
      empSet.add(new Employee(1, "Sanchin", "Tendulker"));
      empSet.add(new Employee(4, "Virat", "Kohli"));
      empSet.add(new Employee(5, "MS", "Dhoni"));
      //Sort by ID using Comparable
      empSet.stream().forEach(System.out::println);
}
}
