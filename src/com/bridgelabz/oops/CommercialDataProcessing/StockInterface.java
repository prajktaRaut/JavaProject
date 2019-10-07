package com.bridgelabz.oops.CommercialDataProcessing;

public interface StockInterface {

	public void stockAccount(String filename);
	public double valueOf();
	public void buy(int amount, String symbol);
	public void sell(int amount,String symbol);
	public void save(String filename);
	public void printReport();

	
}
