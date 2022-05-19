package org.test;

public class Sample {
	
	public void demo() {
		byte age=28;//100--->999((3 digits)-1--->2 digits)
		System.out.println("Employee age is "+age);
		
		short empId=5372;//10000--->99999((5 digits)-1--->4 digits)
		System.out.println("Employee id is "+empId);
		
		int pinCode=600099;//((10 digits)-1--->9 digits)
		System.out.println("Employee pin code is "+pinCode);
		
		long mobNum=9876543210l;
		System.out.println("Employee mob num is "+mobNum);
		
		float weight=77.5f;
		System.out.println("Employee weight is "+weight);
		
		double salary=6378872.22;
		System.out.println("Employee salary is "+salary);
		
		char gender='M';
		System.out.println("Employee gender is "+gender);
		
		String name="Arun";
		System.out.println("Employee name is "+name);
		
		boolean maritalStatus=true;
		System.out.println("Employee marital status is "+maritalStatus);
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		s.demo();
	}

}
