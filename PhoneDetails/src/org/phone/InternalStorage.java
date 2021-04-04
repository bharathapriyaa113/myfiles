package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("processorname");
	}
	public void ramSize() {
		System.out.println("RAM size");
	}
	public static void main(String[] args) {
		InternalStorage is=new InternalStorage();
		is.processorName();
		is.ramSize();
		ExternalStorage es=new ExternalStorage();
		es.size();
	}
}

