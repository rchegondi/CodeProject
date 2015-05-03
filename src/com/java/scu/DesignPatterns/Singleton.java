package com.java.scu.DesignPatterns;

public class Singleton {
	
	//create a static variable so that it can hold one instance of our class
	private static Singleton uniqueInstance = null;
	//create a private constructor so that only class itself can create an object
	private Singleton(){
		
		
	}
    /*Key Points for getInstance Method
     * 1) return type Singleton
     * 2) Synchronize the method so that thread will wait for their turn before entering this method
     * 3) 1st check the class is already having an instance.
     * */
	public static Singleton getInstance(){
		
	if(uniqueInstance == null){
			
	  synchronized(Singleton.class){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
	  }	
	}
	return uniqueInstance;

	}
}
