package com.bridgelabz.oops.StockReport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.oops.Inventory.OopUtility;
import com.bridgelabz.utility.Utility;

public class StockReport {

	public static void main(String[] args) throws IOException {
		
		List<StockInformation> list= new ArrayList<StockInformation>();
		
		System.out.println("enter the number of stock ");
		int n=Utility.integerValue();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name of stock");
			String Name=Utility.bufferStringValue();
			
			System.out.println("enter the number of shares ");
			double number=Utility.doubleValue();
			
			System.out.println("enter the price of shares");
			double Price=Utility.doubleValue();
			
			StockDetails.addStock(Name, number, Price);
			
			StockDetails.calculateStock();
			
	
			 
		}
		

	}

}
