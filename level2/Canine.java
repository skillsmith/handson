package com.java.level2;

public abstract class Canine implements Animal{
	
	String respond2Stimuli = "bite";

	public void eatFood(){
		System.out.println("Hunts and eats meat");
	}
	public void moveAround(){
		System.out.println("walk or run");
	}
	
	public abstract void makeSound();
	
}