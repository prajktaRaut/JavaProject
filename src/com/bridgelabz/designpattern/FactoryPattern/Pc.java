package com.bridgelabz.designpattern.FactoryPattern;

public class Pc implements Computer{

	private String RAM;
	private String HDD;
	private String CPU;
	
	
	public Pc(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}


	@Override
	public String getRAM() {
		
		return this.RAM;
	}


	@Override
	public String getHDD() {
		
		return this.HDD;
	}


	@Override
	public String getCPU() {
	
		return this.CPU;
	}


	@Override
	public String toString() {
		return "Pc [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	
	
	
	


}
