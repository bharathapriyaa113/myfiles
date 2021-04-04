package org.bike;

public class Ktm extends Bike{
	public void cost() {
		System.out.println("bike cost is 45000");
	}
	public void speed() {
		System.out.println("bike speed is 60km/hr");
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}
}
