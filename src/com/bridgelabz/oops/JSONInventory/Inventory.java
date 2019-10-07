package com.bridgelabz.oops.JSONInventory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

public class Inventory {

	static JSONArray array = new JSONArray();

	static List<String> list= new ArrayList<String>();
	
	static JSONObject inventoryObject= new JSONObject();
	

	public static void main(String[] args) throws IOException {

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
				
				
				InventoryDetails.addRiceDetails();
				InventoryDetails.readJson();
				
				break;

			case 2:

				//InventoryDetails.readJson();
				
				InventoryDetails.addRiceDetails();

				InventoryDetails.readJson();
				
				/*
				 * inventoryObject.put("InventoryDetails", obj11);
				 * 
				 * InventoryDetails.writeJson(inventoryObject);
				 */
				
				InventoryDetails.readJson();
				 
				 

				break;

			case 3:

				//InventoryDetails.readJson();
				
				InventoryDetails.addRiceDetails();

			
				
				/*
				 * inventoryObject.put("InventoryDetails", obj111);
				 * 
				 * InventoryDetails.writeJson(inventoryObject);
				 */
				
				
				//InventoryDetails.readJson();
				 
				 


				

				break;

			case 4:
				flag = false;
				break;

			default:
				System.out.println("Enter proper input");
				break;
			}

		} while (flag);

		//InventoryDetails.readJson();
		
		InventoryDetails.readJson();

	}

}
