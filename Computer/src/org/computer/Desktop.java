package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size is 16inch");
	}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopSize();
	d.computerModel();
}
}
