package org.edu;

public class Education extends Arts {
	
	public void ug() {
	System.out.println("UG degree is EEE");
}
public void pg() {
	System.out.println("PG degree is MBA");
}
public static void main(String[] args) {
	
	Education e=new Education();
	e.ug();
	e.pg();
	e.bA();
	e.bBA();
	e.bEd();
	e.bsc();
	e.bE();
	e.bTech();
	e.mbbs();
	e.physiyo();
	e.dental();
}
}
