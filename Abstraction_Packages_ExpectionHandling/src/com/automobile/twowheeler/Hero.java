package com.automobile.twowheeler;

import com.automobile.Vehicle;
public class Hero extends Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Hero splendor";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "RT12456";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Dileep";
	}

	public int getSpeed() {
		return 80;
	}
	
	public void radio() {
		System.out.println("radio is playing");
	}
	
}
