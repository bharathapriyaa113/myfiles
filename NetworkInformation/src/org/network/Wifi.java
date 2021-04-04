package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("wifiname");
	}
	public static void main(String[] args) {
		Wifi w=new Wifi();
		w.wifiName();
		MobileData md=new MobileData();
		md.dataName();
		Lan l=new Lan();
		l.lanName();
		Wireless wl=new Wireless();
		wl.modamName();
	}

}
