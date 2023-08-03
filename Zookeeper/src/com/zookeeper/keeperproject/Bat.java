package com.zookeeper.keeperproject;

public class Bat extends Mammal {

	public Bat(int energy) {
		super(energy);
		energy = 300;
	}
	
//	create fly method which subtracts 50 energy and returns the energyLevel after printing a string;
	public int fly() {
		energyLevel = energyLevel - 50;
		System.out.println("The giant bat has taken flight!");
		return energyLevel;
	}
	
//	create eatHumans method which adds 25 energy and returns the energyLevel after printing a string;	
	public int eatHumans() {
		energyLevel = energyLevel + 25;
		System.out.println("The giant bat has eaten a human!");
		return energyLevel;
	}
	
//	create attackTown method which subtracts 100 energy and returns the energyLevel after printing a string;
	public int attackTown() {
		energyLevel = energyLevel - 100;
		System.out.println("The giant bat is terrorizing the town!");
		return energyLevel;
	}
	
}
