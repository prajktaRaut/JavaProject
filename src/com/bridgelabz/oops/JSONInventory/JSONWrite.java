package com.bridgelabz.oops.JSONInventory;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oops.Inventory.ProductList;
import com.bridgelabz.utility.Utility;

public class JSONWrite {

	public static void main(String[] args) {
		
		
		//JSONObject class create JSONObject 
		
		ProductList p= new ProductList();
		
		JSONObject object1 = new JSONObject();

		
		  JSONObject object2 = new JSONObject();
		  
		 // JSONObject object3 = new JSONObject();
		 

		// Provides put function to insert the details into JSON file
		object1.put("Name", "Rice");
		object1.put("Weight", "20");
		object1.put("Price", "50");

		
		  object2.put("Name", "Pulses"); object2.put("Weight", "40");
		  object2.put("Price", "80");
		  
		/*
		 * object3.put("Name", "Wheat"); object3.put("Weight", "60");
		 * object3.put("Price", "20");
		 */
		JSONArray list = new JSONArray();

		list.add(object1);
		list.add(object2);
		
		 
		
		
		try 
		{
			FileWriter writer= new FileWriter("/home/user/Documents/information.json");
		
			// write function is used to write in a file
			
			writer.write(list.toJSONString());
			
			writer.flush();
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
		
	}
}
