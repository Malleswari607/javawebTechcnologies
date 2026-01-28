package com.ibm.Interfaces;

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird fly");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird Land");

	}

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Bird takeoff ");

	}

}
