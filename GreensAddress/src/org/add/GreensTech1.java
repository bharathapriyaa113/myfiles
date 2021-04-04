package org.add;

public class GreensTech1 {
	//data type
	public void greensOmr(String name) {
		System.out.println("centre name is:"+name);
	}
	//data type count
	public void greensOmr(String name,int id) {
		System.out.println("centre name is:"+name);
		System.out.println("centre id is:"+id);
	}
	
	//data type order
	public void greensOmr(String adress,long phno) {
		System.out.println("centre adress is:"+adress);
		System.out.println("centre phno is:"+phno);
	}
	public void greensOmr(long alterphno,String alteradress) {
		System.out.println("centre alter adress is:"+alteradress);
		System.out.println("centre alter phno is:"+alterphno);
	}
	
public static void main(String[] args) {
	GreensTech1 g=new GreensTech1();
	g.greensOmr("Greens OMR branch");
	g.greensOmr("selenium", 123);
	g.greensOmr("jain college", 23423424323l);
	g.greensOmr(3423422343l, "thoraipakkam");
}
}
