package com.zookeeper.keeperproject;
public class MammalTest {

	public static void main(String[] args) {
		
		Gorilla coco = new Gorilla(100);

		
		coco.throwSomething();		
		coco.throwSomething();		
		coco.throwSomething();
		System.out.println("Gorilla1's energy is:" + coco.getEnergyLevel() + "\n");
		
		coco.eatBananas();
		coco.eatBananas();
		System.out.println("Gorilla1's energy is:" + coco.getEnergyLevel() + "\n");
		
		coco.climb();
		System.out.println("Gorilla1's energy is:" + coco.getEnergyLevel() + "\n");
		
		Bat Jimothy = new Bat(300);
		
		Jimothy.attackTown();
		Jimothy.attackTown();
		Jimothy.attackTown();
		System.out.println("Jimothy's energy is:" + Jimothy.getEnergyLevel() + "\n");
		
		Jimothy.eatHumans();
		Jimothy.eatHumans();
		System.out.println("Jimothy's energy is:" + Jimothy.getEnergyLevel() + "\n");
		
		Jimothy.fly();
		Jimothy.fly();
		System.out.println("Jimothy's energy is:" + Jimothy.getEnergyLevel() + "\n");
		
	}

}
