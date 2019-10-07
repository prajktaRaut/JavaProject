package com.bridgelabz.designpattern.AdapterDesignPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
		getclassadapterimpl();
		getobjectadapterimpl();

	}

	private static Volt getVolt(SocketAdapter adapter,int i)
	{
		switch (i) {
		case 3:
			
			return adapter.get3Volt();
		
		case 12:
			
			return adapter.get12Volt();
			
		case 120:
	
			return adapter.get120Volt();
			
		default:
			return adapter.get120Volt();
			
		}
		
	}
	
	private static void getclassadapterimpl()
	{
		SocketAdapter socketadapter= new SocketClassAdpaterimpl();
		
		Volt v3=getVolt(socketadapter, 3);
		Volt v12=getVolt(socketadapter, 12);
		Volt v120=getVolt(socketadapter, 40);
		
		System.out.println("V3 volts using class adapter "+v3.getVolt());
		System.out.println("V12 volts using class adapter "+v12.getVolt());
		System.out.println("V120 volts using class adapter "+v120.getVolt());
		
		
	}
	
	private static void getobjectadapterimpl()
	{
		SocketAdapter socketAdapter= new SocketObjectAdapterimpl();
		
		Volt v3=getVolt(socketAdapter, 3);
		Volt v12=getVolt(socketAdapter, 12);
		Volt v120= getVolt(socketAdapter, 40);
		
		
		System.out.println("v3 volts using object adapter "+v3.getVolt());
		System.out.println("v12 volts using object adapter "+v12.getVolt());
		System.out.println("v120 volts using object adapter "+v120.getVolt());
		
		
	}
	
	
}
