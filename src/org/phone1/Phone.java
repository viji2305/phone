package org.phone1;

public class Phone {
	
	private void phoneInfo(int model, String name) {
		
		System.out.println("Phone model: "+model+"\n"+"phone name: "+name);
	}
	
	private void phoneInfo(String name, int model) {
		
		System.out.println("phone name: "+name+"\n"+"phone model: "+model);
	}
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.phoneInfo(123,"Samsung");
		p.phoneInfo("MI",345);
	}

}
