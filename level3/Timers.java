package com.java.level3;

public enum Timers {
	
	SLOW (30.0d),			//properties
	MEDIUM (10.0d),
	FAST (2.0d);
	
	public double appSyncTimeout;
	private double mySyncTimeout;
	
	Timers(double timeout){
		this.appSyncTimeout = timeout;
	}
	
	public void setMySyncTimeout(double mySync){
		this.mySyncTimeout=mySync;
	}
	
	public double getMySyncTimeout(){
		return mySyncTimeout;
	}
	
}