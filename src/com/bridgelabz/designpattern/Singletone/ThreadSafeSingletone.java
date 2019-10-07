package com.bridgelabz.designpattern.Singletone;

public class ThreadSafeSingletone {

	static ThreadSafeSingletone instance;
	
	
	private ThreadSafeSingletone() {
		System.out.println("in thread safe");
	}
	
	public static synchronized ThreadSafeSingletone getinstance()
	{
		if(instance==null)
		{
			instance= new ThreadSafeSingletone();
			
		}
		
		return instance;
	}
	
	
}
