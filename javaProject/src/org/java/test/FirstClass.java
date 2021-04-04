package org.java.test;

public class FirstClass {
	private void firstMethod() {
		System.out.println("test1");

	}
	
	private void secondMethod() {
		System.out.println("test2");

	}
	public static void main(String[] args) {
		FirstClass f=new FirstClass();
		f.firstMethod();
		f.secondMethod();
	}

}
