package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("vehicle is neccessary");
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.VehicleNecessery();
		TwoWheller t=new TwoWheller();
		t.bike();
		t.cycle();
		ThreeWheeler tw=new ThreeWheeler();
		tw.Auto();
		FourWheeler fw=new FourWheeler();
		fw.bus();
		fw.car();
		fw.lorry();
	}
}
