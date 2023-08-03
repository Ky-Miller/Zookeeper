package com.zookeeper.keeperproject;
public class Mammal {
	public int energyLevel = 100;
	
//	create our Mammal constructor with an energy level with a default value of 100
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
//	getEnergyLevel returns the value for the Mammal's current energy level
	public int getEnergyLevel() {
		return energyLevel;
	}
}
