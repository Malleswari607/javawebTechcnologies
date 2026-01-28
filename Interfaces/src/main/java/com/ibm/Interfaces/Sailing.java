package com.ibm.Interfaces;

public class Sailing implements Flyer, Sailer {

	@Override
	public void sail() {
		System.out.println("BOAT SAILING");

	}

	@Override
	public void dock() {
		System.out.println("BOAT DOCKING");
	}

	@Override
	public void fly() {
		System.out.println("BOAT FLYING");

	}

	@Override
	public void land() {
		System.out.println("BOAT LANDING");
	}

	@Override
	public void takeoff() {
		System.out.println("BOAT TAKING OFF");
	}

}
