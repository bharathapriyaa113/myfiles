package org.univ;

public class College {

	public void ug() {
		System.out.println("ug degree offered:BE");
	}
	public void pg() {
		System.out.println("pg degree offered ME");
	}
	public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
	}

}
