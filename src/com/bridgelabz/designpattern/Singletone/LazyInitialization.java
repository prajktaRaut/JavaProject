package com.bridgelabz.designpattern.Singletone;

public class LazyInitialization {

	public static void main(String[] args) {
		
		LazyInitializationSingletone obj1=LazyInitializationSingletone.getInstance();
		
		LazyInitializationSingletone obj2=LazyInitializationSingletone.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		

	}

}
