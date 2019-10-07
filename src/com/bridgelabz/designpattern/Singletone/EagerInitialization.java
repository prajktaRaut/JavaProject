package com.bridgelabz.designpattern.Singletone;

public class EagerInitialization {

	
	public static void main(String[] args) {

		EagerInitializationSingletone object =EagerInitializationSingletone.getinstance();
		EagerInitializationSingletone object1 =EagerInitializationSingletone.getinstance();
		
		
		System.out.println(object.hashCode());
		System.out.println(object1.hashCode());
		


	}

	
	
}
