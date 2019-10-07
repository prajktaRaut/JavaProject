package com.bridgelabz.designpattern.Singletone;

public class EagerInitializationSingletone {

	
	static EagerInitializationSingletone insatnce= new EagerInitializationSingletone();
	
	
	private EagerInitializationSingletone() {
		
	}
	
	public static EagerInitializationSingletone getinstance()
	{
		return insatnce;
		
	}

	
	
}
