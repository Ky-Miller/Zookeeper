package com.zookeeper.keeperproject;
public class Gorilla extends Mammal {

	public Gorilla(int energy) {
		super(energy);
	}

//	create thowSomething method which subtracts 5 energy and returns the energyLevel after printing a string;
	public int throwSomething() {
		energyLevel = energyLevel - 5;
		System.out.println("The Gorilla has thrown something!");
		return energyLevel;
	}
	
//	create eatBananas method which adds 10 energy and returns the energyLevel after printing a string;
	public int eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("The Gorilla has eaten it's fill of bananas and is satisfied.");
		return energyLevel;
	}
	
//	create climb method which subtracts 10 energy and returns the energyLevel after printing a string;
	public int climb() {
		energyLevel = energyLevel - 10;
		System.out.println("The Gorilla has climbed a tree!");
		return energyLevel;
	}

}
