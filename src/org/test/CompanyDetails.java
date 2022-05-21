package org.test;

//Child Class
public class CompanyDetails extends ClientDetails {
	
	public void compId() {
		System.out.println("Company id is 100");

		System.out.println("Company id is 100");
		System.out.println("Company id is 1000");
		System.out.println("Company id is 10000");
		System.out.println("Company name is TCS");
		System.out.println("Employee id is 1000000");
	}
	
	public void compName() {
		System.out.println("Company name is TCS");
		System.out.println("Company name is TCS");

	}
	
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		c.clientId();
		c.clientName();
		//c.empId();
		//c.empName();
				
	}

}
