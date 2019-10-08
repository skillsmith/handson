package com.java.level2;

public abstract class Bird implements Animal{
	
	String respond2Stimuli = "pecks";
	boolean inFlight;
	
	public void eatFood(){
		System.out.println("Feed on fruits, seeds and meat too");
	}
	public void moveAround(){
		System.out.println("hops or walks");
	}
	public void makeSound(){
		System.out.println("All kinds");
	}
	
	public abstract void fly();
}