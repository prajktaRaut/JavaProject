package com.bridgelabz.oops.Inventory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.bridgelabz.oops.JSONInventory.InventoryDetails;
import com.bridgelabz.utility.Utility;

public class InventoryManagment {

	public static void main(String[] args) throws IOException {
		
	List<ProductList> listofproducts= new ArrayList<ProductList>();
	
	boolean flag = true;

	do {
		System.out.println("1. Rice");
		System.out.println("2. Pulses");
		System.out.println("3. Wheat");
		System.out.println("4. Exit");

		System.out.println("enter your choice ");

		int choice = Utility.integerValue();

		switch (choice) {

		case 1:
				
			System.out.println("enter the name of product");
			String productName=Utility.bufferStringValue();
			
			System.out.println("enter the name of "+productName);
			String Name=Utility.bufferStringValue();
		
			System.out.println("enter the weight of "+productName);
			float Weight=Utility.floatValue();
			
			System.out.println("enter the price of "+productName);
			Double Price=Utility.doubleValue();
			
			OopUtility.addInventory(productName, Name, Weight, Price);
			
			OopUtility.calculateInventory();
			
	
			 

			break;

		case 2:
			System.out.println("enter the name of product");
			String productName1=Utility.bufferStringValue();
			
			System.out.println("enter the name of "+productName1);
			String Name1=Utility.bufferStringValue();
		
			System.out.println("enter the weight of "+productName1);
			double Weight1=Utility.doubleValue();
			
			System.out.println("enter the price of "+productName1);
			double Price1=Utility.doubleValue();
			
			OopUtility.addInventory(productName1, Name1, Weight1, Price1);
			
			OopUtility.calculateInventory();
				
			

			break;

		case 3:System.out.println("enter the name of product");
		String productName11=Utility.bufferStringValue();
		
		System.out.println("enter the name of "+productName11);
		String Name11=Utility.bufferStringValue();
	
		System.out.println("enter the weight of "+productName11);
		float Weight11=Utility.floatValue();
		
		System.out.println("enter the price of "+productName11);
		Double Price11=Utility.doubleValue();
		
		OopUtility.addInventory(productName11, Name11, Weight11, Price11);
		
		OopUtility.calculateInventory();

			
			

			break;

		case 4:
			flag = false;
			break;

		default:
			System.out.println("Enter proper input");
			break;
		}

	} while (flag);


	}

}
