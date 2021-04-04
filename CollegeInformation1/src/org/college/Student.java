package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("student name is priya");
	}
	public void studentDept() {
		System.out.println("student department EEE");
	}
	public void studentId() {
		System.out.println("student ID is 11EE005");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
	}
}
