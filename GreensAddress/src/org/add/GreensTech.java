package org.add;

import org.add.GreensTech;

public class GreensTech {
	private void greensOmr() {
		System.out.println("OMR Branch");

	}
	private void greensAdayar() {
		System.out.println("Adyar Branch");

	}

	private void greensTambaram() {
		System.out.println("Tambaram Branch");

	}

	private void greensVelacherry() {
		System.out.println("Velachery Branch");

	}

	private void greensAnnaNagar() {
		System.out.println("AnnaNagar Branch");
	}


	public static void main(String[] args) {
	
		GreensTech g=new GreensTech();
		g.greensAdayar();
		g.greensTambaram();
		g.greensOmr();
		g.greensVelacherry();
		g.greensAnnaNagar();
	}
}
