package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("savings account");
	}
	public void fixed() {
		System.out.println("fixed account");
	}
	public static void main(String[] args) {
		BankInfo bi=new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
		
	}
}
