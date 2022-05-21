package org.test;

public class EmployeeDetails {

	public void empInfo() {
		System.out.println("Employee Info:");
	}

	// Datatype
	public void empInfo(int id) {
		System.out.println("Employee id is "+id);
	}

	// Different Datatype
	public void empInfo(String name) {
		System.out.println("Employee name is "+name);
	}

	// Datatype--->Count
	public void empInfo(String email, long mobNum) {
		System.out.println("Employee email is "+email);
		System.out.println("Employee mob num is "+mobNum);
	}
	//Datatype--->Order
	public void empInfo(long mobNum,String email) {
		System.out.println("Employee alternate email is "+email);
		System.out.println("Employee alternate mob num is "+mobNum);
	}
	
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.empInfo();
		e.empInfo(100);
		e.empInfo("Arun");
		e.empInfo("arun@gmail.com",9876543210l);
		e.empInfo(9988776655l,"arun2@gmail.com ");
	}
}
