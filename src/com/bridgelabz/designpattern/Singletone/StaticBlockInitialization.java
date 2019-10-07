package com.bridgelabz.designpattern.Singletone;

public class StaticBlockInitialization {

	public static void main(String[] args) {
		
		StaticBlockInitializationSingaltone object=StaticBlockInitializationSingaltone.getInstance();
		
		System.out.println(object.hashCode());

	}

}
