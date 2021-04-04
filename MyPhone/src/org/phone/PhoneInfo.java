package org.phone;



public class PhoneInfo {
	private void phoneName() {
		System.out.println("987654310");

	}
	private void phoneMieiNum() {
		System.out.println("12345678901");

	}

	private void camera() {
		System.out.println("Front & Back Camera");

	}

	private void storage() {
		System.out.println("64GB");

	}

	private void osName() {
		System.out.println("Android OS");
	}


	public static void main(String[] args) {
	
		PhoneInfo g=new PhoneInfo();
		g.phoneName();
		g.phoneMieiNum();
		g.camera();
		g.storage();
		g.osName();
	}

}
