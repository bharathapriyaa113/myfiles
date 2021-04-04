package org.computer;

public class Desktop implements HardWare,Software {
	
	public void desktopModel() {
		System.out.println("desktop desc:");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("software Resourses");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardware Resourses");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	}

}
