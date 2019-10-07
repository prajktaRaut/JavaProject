package com.bridgelabz.designpattern.Singletone;

public class ThreadSafe {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				ThreadSafeSingletone obj=ThreadSafeSingletone.getinstance();
				
				System.out.println(obj.hashCode());
				
			}
		});
		
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				ThreadSafeSingletone obj= ThreadSafeSingletone.getinstance();
				
				System.out.println(obj.hashCode());
				
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
