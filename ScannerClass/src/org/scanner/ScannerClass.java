package org.scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Student ID:");
		int stuID=sc.nextInt();	
		System.out.println("student id is :"+stuID);
		System.out.println("enter student name");
		String stuName=sc.next();	
		System.out.println("student name is :"+stuName);
		System.out.println("enter the Student Mark1:");
		int stuMark1=sc.nextInt();	
		System.out.println("student id is :"+stuMark1);
		System.out.println("enter the Student Mark2:");
		int stuMark2=sc.nextInt();	
		System.out.println("student id is :"+stuMark2);
		System.out.println("enter the Student Mark3:");
		int stuMark3=sc.nextInt();	
		System.out.println("student id is :"+stuMark3);
		System.out.println("enter the Student Mark4:");
		int stuMark4=sc.nextInt();	
		System.out.println("student id is :"+stuMark4);
		System.out.println("enter the Student Mark5:");
		int stuMark5=sc.nextInt();	
		System.out.println("student id is :"+stuMark5);
		
		System.out.println(stuMark1+stuMark2+stuMark3+stuMark4+stuMark5);
		System.out.println((stuMark1+stuMark2+stuMark3+stuMark4+stuMark5)/5);
		
	}

}
