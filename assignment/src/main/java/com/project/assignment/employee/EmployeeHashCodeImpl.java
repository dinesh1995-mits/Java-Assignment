package com.project.assignment.employee;

import java.util.Objects;
/**
 * Task 3: Employee pojo with id, firstname, lastname
Write multiple junits to study the behavior when 2 employees with same details are added to hashset
. implementing only the hashcode method
 *
 */
public class EmployeeHashCodeImpl {
	private String id;
	private String firstName;
	private String lastName;

	public EmployeeHashCodeImpl(String id, String firstName, String lastName) {
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
	 // Only hashCode implemented
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
