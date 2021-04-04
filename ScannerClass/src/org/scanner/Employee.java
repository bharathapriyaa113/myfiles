package org.scanner;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the emp ID:");
		int empId=sc.nextInt();	
		System.out.println("emp id is :"+empId);
		System.out.println("enter employee name");
		String empName=sc.nextLine();	
		System.out.println("emp name is :"+empName);
		System.out.println("enter employee email");
		String empEmail=sc.next();	
		System.out.println("emp email is :"+empEmail);
		System.out.println("enter employee Ph No");
		long empPhoneno=sc.nextLong();	
		System.out.println("emp phone no is :"+empPhoneno);
		System.out.println("enter employee Salary");
		double salary=sc.nextDouble();	
		System.out.println("emp salary is :"+salary);
		System.out.println("enter employee Gender");
		String empGender=sc.next();	
		System.out.println("emp Gender is :"+empGender);
		System.out.println("enter employee City");
		String empCity=sc.next();	
		System.out.println("emp Gender is :"+empCity);
		
		
		
		
	}

}
