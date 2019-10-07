package com.bridgelabz.designpattern.Singletone;

public class LazyInitializationSingletone {

	static LazyInitializationSingletone instance;

	private LazyInitializationSingletone() {
		System.out.println("instance created");
	}

	public static LazyInitializationSingletone getInstance() {
		// instance= new LazyInitializationSingletone();

		
		if (instance == null) {
			instance = new LazyInitializationSingletone();
		}
		  
		return instance;
	}

}
