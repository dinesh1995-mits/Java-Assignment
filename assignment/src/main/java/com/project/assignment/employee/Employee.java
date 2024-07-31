package com.project.assignment.employee;
/**
 * Task 3: Employee pojo with id, firstname, lastname
Write multiple junits to study the behavior when 2 employees with same details are added to hashset
without implementing hashcode or equals
 *
 */
public class Employee {
private String id;
private String firstName;
private String lastName;

public Employee(String id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}


}
