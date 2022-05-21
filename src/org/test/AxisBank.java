package org.test;

//Child Class
public class AxisBank extends HdfcBank {

	public void fixed() {
		System.out.println("Fixed..6%");
	}
	
	public void savings() {
		System.out.println("Savings..7%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.deposit();
		a.fixed();
	}
}
