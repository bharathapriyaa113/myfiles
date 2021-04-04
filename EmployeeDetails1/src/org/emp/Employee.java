package org.emp;

public class Employee {

	public void empId() {
		
		System.out.println("Emp id is 123");
	}
	//Data Type
	
public void empId(String name) {
		
		System.out.println("Emp name is :"+name);
	}
public void empId(int id) {
	
	System.out.println("Emp ID is :"+id);
}
public void empId(long mobNo) {
	
	System.out.println("Emp mobil number is :"+mobNo);
}
public void empId(double salary) {
	
	System.out.println("Emp salary number is :"+salary);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empId("Priya");
	e.empId(123);
	e.empId(999999999l);
	e.empId(444444d);
	
}

}