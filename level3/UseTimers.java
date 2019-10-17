package com.java.level3;

public class UseTimers {
	
	static double appSyncTimeout;
	
	public static final double slow = 60.0d;
	public static final double medium = 30.0d;
	public static final double fast = 10.0d;
	
	public static void main(String[] args) {
		
		Timers timeOuts; //not like our usual class
		
		Timers[] toArray = Timers.values();
		System.out.println("List of Timers with values\n");
		for (Timers timeout: toArray){
			System.out.println(timeout +">>"+timeout.appSyncTimeout);
		}

		//morning the app is slow
		timeOuts = Timers.SLOW;
		System.out.println("\nMy app sync timeout for the day is " + timeOuts.SLOW + " with value " + timeOuts.appSyncTimeout);
		
		//afternoon the app is OK
		timeOuts = Timers.MEDIUM;
		System.out.println("My app sync timeout for the day is " + timeOuts.MEDIUM + " with value " + timeOuts.appSyncTimeout);

		//evening the app is fast
		timeOuts = Timers.FAST;
		System.out.println("My app sync timeout for the day is " + timeOuts.FAST + " with value " + timeOuts.appSyncTimeout);


		timeOuts.setMySyncTimeout(200.0d);
		System.out.println("\nMy module level timeout>>"+ timeOuts.getMySyncTimeout());
		
	}

}
