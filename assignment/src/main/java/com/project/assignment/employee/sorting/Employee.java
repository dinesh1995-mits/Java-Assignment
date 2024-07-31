package com.project.assignment.employee.sorting;

import java.util.Objects;

/**
 * Task 3:Above Employee pojo in a treeset
 *
 */
public class Employee implements Comparable<Employee> {
private Integer id;
private String firstName;
private String lastName;

public Employee(Integer id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Integer getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}
@Override
public int hashCode() {
	return Objects.hash(firstName, id, lastName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
			&& Objects.equals(lastName, other.lastName);
}
@Override
public int compareTo(Employee other) {
	//compare with id
    int idComparison = Integer.compare(this.id, other.id);
    if (idComparison != 0) {
        return idComparison; 
    }
    // if id is same compare with first name
    int firstNameComparison = this.firstName.compareTo(other.firstName);
    if (firstNameComparison != 0) {
        return firstNameComparison; 
    }
    // if id and first name is same compare with lastName
    return this.lastName.compareTo(other.lastName);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}


}
