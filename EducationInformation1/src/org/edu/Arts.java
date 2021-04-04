package org.edu;

public class Arts {
	public void bsc() {
		System.out.println("BSC");
	}
	public void bEd() {
		System.out.println("B.Ed");
	}
	public void bA() {
		System.out.println("bA");
	}
	public void bBA() {
		System.out.println("bBA");
	}
	public void ug() {
		System.out.println("ug offered course is BE");
	}
	public void pg() {
		System.out.println("pg offered course is ME");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bsc();
		a.bBA();
		a.bA();
		a.bEd();
		a.ug();
		a.pg();
	}

}
