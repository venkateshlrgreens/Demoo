package org.test;

import org.test1.ClientDetails;

public class CompanyDetails {
	
	public void compId() {
		System.out.println("Company id is 100");
		System.out.println("Company name is TCS");
		System.out.println("Employee id is 1000000");
	}
	
	public void compName() {
		System.out.println("Company name is TCS");
	}
	
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		EmployeeDetails e=new EmployeeDetails();
		e.empId();
		e.empName();
		ClientDetails cd=new ClientDetails();
		cd.clientId();
		cd.clientName();
		
	}

}
