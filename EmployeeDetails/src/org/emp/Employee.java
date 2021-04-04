package org.emp;

public class Employee {
	private void empId() {
		System.out.println("12345");

	}
	private void empName() {
		System.out.println("priya");

	}

	private void empDob() {
		System.out.println("14111993");

	}

	private void empPhone() {
		System.out.println("9876543210");

	}

	private void empEmail() {
		System.out.println("priya@gmail.com");

	}

	private void empAddress() {
		System.out.println("Ariyalur");

	}
	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empAddress();
		e.empEmail();
		e.empPhone();
	}


}
