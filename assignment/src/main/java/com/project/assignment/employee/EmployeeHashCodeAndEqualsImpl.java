package com.project.assignment.employee;

import java.util.Objects;
/**
 * Task 3: Employee pojo with id, firstname, lastname
Write multiple junits to study the behavior when 2 employees with same details are added to hashset
implementing both hashcode & equals method
 *
 */
public class EmployeeHashCodeAndEqualsImpl {
	private String id;
	private String firstName;
	private String lastName;
	public EmployeeHashCodeAndEqualsImpl(String id, String firstName, String lastName) {
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
		EmployeeHashCodeAndEqualsImpl other = (EmployeeHashCodeAndEqualsImpl) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}
	
}
