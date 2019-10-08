package com.java.level2;


public class Whale extends Cetacean implements Mammal, Fish, Animal{

	public static void main(String[] args) {
		Whale blueWhale = new Whale();
		blueWhale.eatFood();
		blueWhale.swim();
		blueWhale.moveAround();
		blueWhale.makeSound();
	}


	@Override
	public void eatFood() {
		System.out.println("Just a ton of krill per day you know!");
		
	}

	@Override
	public void moveAround() {
		System.out.println("move around? I shuttle between the poles!!");
	}
	
	public void feedBaby(){
		System.out.println("Feed babies with milk");
	}

}