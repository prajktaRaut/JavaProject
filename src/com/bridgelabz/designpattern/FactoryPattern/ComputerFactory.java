package com.bridgelabz.designpattern.FactoryPattern;

public class ComputerFactory {

	
	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu)
	{
		Computer com=null;
		
		switch (type) {
		case PC:
			
			com=new Pc(ram, hdd, cpu);
			
		break;

		case SERVER:
			
			com= new Server(ram, hdd, cpu);
			
			break;
		
		default:
			
			System.out.println("Enter proper input ");
			break;
		}
		
		
		
		return com;
		
	}
	
	
	
}


