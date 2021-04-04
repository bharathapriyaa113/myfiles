package org.phone;

public class Phone {
	public void phoneInfo() {
		System.out.println("phone info details given below:");
	}
	public void phoneInfo(String name, int memory) {
		System.out.println("Phone name is :"+name);
		System.out.println("phone memory is:"+memory);
	}
	public void phoneInfo(int ram, String model) {
		System.out.println("phone ramsize is:"+ram);
		System.out.println("phone model is:"+model);
	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo();
		p.phoneInfo("vivo", 64);
		p.phoneInfo(8, "v15");
	}
	
	

}
