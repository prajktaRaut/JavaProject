package com.bridgelabz.designpattern.Singletone;

public class BillPughSingletone {
	
	
	
	private BillPughSingletone() {
		
		
	}
	
	
	public static class Billpughinner
	{
		static BillPughSingletone instance= new BillPughSingletone();
		
	}
	
	public static BillPughSingletone getInstance()
	{
		return Billpughinner.instance;
	}

}
