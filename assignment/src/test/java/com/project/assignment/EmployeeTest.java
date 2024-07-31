package com.project.assignment;

import java.util.HashSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.project.assignment.employee.Employee;
import com.project.assignment.employee.EmployeeEqualsImpl;
import com.project.assignment.employee.EmployeeHashCodeAndEqualsImpl;
import com.project.assignment.employee.EmployeeHashCodeImpl;
/**
 * Task 3: Employee pojo with id, firstname, lastname
Write multiple junits to study the behavior when 2 employees with same details are added to hashset
1. without implementing hashcode or equals
2. implementing only the hashcode method
3. implementing only the equals method
4. implementing both hashcode & equals method
 *
 */
public class EmployeeTest {
	static String id="";
	static String fName="";
	static String lName="";
	
	@BeforeAll
	public static void init() {
		try {
			id="1";
			fName="Dinesh";
			lName="Mohanty";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//without implementing hashcode or equals	
@Test
public void twoEmpWithoutHashcodeOrEquals() {
	System.out.println("without implementing hashcode or equals");
	Employee emp1=new Employee(id, fName, lName);
	Employee emp2=new Employee(id, fName, lName);
	HashSet<Employee> hSetEmp=new HashSet<>();
	hSetEmp.add(emp1);
	hSetEmp.add(emp2);
	//hascode 
	 for(Employee emp:hSetEmp) {
	    	System.out.println(emp.hashCode());

	    }
	 //equals
	 System.out.println(emp1.equals(emp2));
	 
    Assertions.assertEquals(2, hSetEmp.size(), "HashSet Should Contain two Employee Object");
    Assertions.assertTrue(hSetEmp.contains(emp1), "Set should contain emp1");
    Assertions.assertTrue(hSetEmp.contains(emp2), "Set should contain emp2");
   }
// implementing only the hashcode method
@Test
public void twoEmpWithHashcodeImplOnly() {
	System.out.println("implementing only the hashcode method");
	EmployeeHashCodeImpl emp1=new EmployeeHashCodeImpl(id, fName, lName);
	EmployeeHashCodeImpl emp2=new EmployeeHashCodeImpl(id, fName, lName);
	HashSet<EmployeeHashCodeImpl> hSetEmp=new HashSet<>();
	hSetEmp.add(emp1);
	hSetEmp.add(emp2);
	//hascode 
	 for(EmployeeHashCodeImpl emp:hSetEmp) {
	    	System.out.println(emp.hashCode());

	    }
	 //equals
	 System.out.println(emp1.equals(emp2));
	 
    Assertions.assertEquals(2, hSetEmp.size(), "HashSet Should Contain two Employee Object");
    Assertions.assertTrue(hSetEmp.contains(emp1), "Set should contain emp1");
    Assertions.assertTrue(hSetEmp.contains(emp2), "Set should contain emp2");
   }

@Test
public void twoEmpWithEqualsMethodImplOnly() {
	System.out.println("implementing only the equals method");
	EmployeeEqualsImpl emp1=new EmployeeEqualsImpl(id, fName, lName);
	EmployeeEqualsImpl emp2=new EmployeeEqualsImpl(id, fName, lName);
	HashSet<EmployeeEqualsImpl> hSetEmp=new HashSet<>();
	hSetEmp.add(emp1);
	hSetEmp.add(emp2);
	//hascode 
	 for(EmployeeEqualsImpl emp:hSetEmp) {
	    	System.out.println(emp.hashCode());

	    }
	 //equals
	 System.out.println(emp1.equals(emp2));
	 
    Assertions.assertEquals(2, hSetEmp.size(), "HashSet Should Contain two Employee Object");
    Assertions.assertTrue(hSetEmp.contains(emp1), "Set should contain emp1");
    Assertions.assertTrue(hSetEmp.contains(emp2), "Set should contain emp2");
   }
@Test
public void twoEmpWithEqualsAndHashcodeImplOnly() {
	System.out.println("implementing hashcode and equals method");
	EmployeeHashCodeAndEqualsImpl emp1=new EmployeeHashCodeAndEqualsImpl(id, fName, lName);
	EmployeeHashCodeAndEqualsImpl emp2=new EmployeeHashCodeAndEqualsImpl(id, fName, lName);
	HashSet<EmployeeHashCodeAndEqualsImpl> hSetEmp=new HashSet<>();
	hSetEmp.add(emp1);
	hSetEmp.add(emp2);
	//hascode 
	 for(EmployeeHashCodeAndEqualsImpl emp:hSetEmp) {
	    	System.out.println(emp.hashCode());

	    }
	 //equals
	 System.out.println(emp1.equals(emp2));
	 System.out.println("hashset size "+hSetEmp.size());
	 
    Assertions.assertEquals(1, hSetEmp.size(), "HashSet Should Contain One Employee Object");
    Assertions.assertTrue(hSetEmp.contains(emp1), "Set should contain emp1");
    Assertions.assertTrue(hSetEmp.contains(emp2), "Set should contain emp2");
   }
@AfterAll
public static void clear() {
	System.out.println("JUnit Testing Done!!!");
	
}
}
