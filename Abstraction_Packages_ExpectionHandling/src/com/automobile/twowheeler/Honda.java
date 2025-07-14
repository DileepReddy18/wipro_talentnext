package com.automobile.twowheeler;

import com.automobile.Vehicle;
public class Honda extends Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda activa";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "RT08765";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "sameer";
	}

	public int getSpeed() {
		return 75;
	}
	public void cdPlayer() {
		System.out.println("cd player is playing");
	}
	
}
