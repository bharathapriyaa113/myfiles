package org.college;

public class College {
	public void collegeName() {
		System.out.println("college name is GCE");
	}
	public void collegeCode() {
		System.out.println("college code is 12345");
	}
	public void collegeRank() {
		System.out.println("college rank is 1");
	}
	public static void main(String[] args) {
		College c=new College();
		c.collegeCode();
		c.collegeName();
		c.collegeRank();
		Student s=new Student();
		s.studentDept();
		s.studentName();
		Hostel h=new Hostel();
		h.hostelName();
		Dept d=new Dept();
		d.deptName();
	}
}
