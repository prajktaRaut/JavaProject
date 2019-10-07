package com.bridgelabz.designpattern.FactoryPattern;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer Pc= ComputerFactory.getComputer(ComputerType.PC, "8 GB", "1 TB", "LG");

		Computer Server=ComputerFactory.getComputer(ComputerType.SERVER, "16 GB", "8 GB", "Intel");
		
		System.out.println(Pc);
		System.out.println(Server);
		
	}

}
