package com.bridgelabz.oops.JSONInventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.Inventory.ProductList;
import com.bridgelabz.utility.Utility;

public class InventoryDetails {

	static JSONArray array = new JSONArray();
	
	static List<ProductList> listofproducts= new ArrayList<ProductList>();
	
	public static void addRiceDetails() throws IOException
	{
		ProductList p= new ProductList();
		
		//Rice r= new Rice();
		
		System.out.println("enter the name of product");
		String productName=Utility.bufferStringValue();
		
		System.out.println("enter the name of "+productName);
		String Name=Utility.bufferStringValue();
	
		System.out.println("enter the weight of "+productName);
		float Weight=Utility.floatValue();
		
		System.out.println("enter the price of "+productName);
		Double Price=Utility.doubleValue();
		
		/*
		 * r.setName(Name); r.setWeight(Weight); r.setPrice(Price);
		 */
		
		p.setProductName(productName);
		p.setName(Name);
		p.setWeight(Weight);
		p.setPrice(Price);
		
		JSONObject obj= new JSONObject();
		
		obj.put("InventoryName", p.getProductName());
		obj.put("Name", p.getName());
		obj.put("Weight", p.getWeight());
		obj.put("Price", p.getPrice());
		
		
		array.add(obj);
	
		writeJson();
		
		System.out.println("Calculate Inventory value of rice is "+(p.getWeight()*p.getPrice()));
		  
		
		 
	
		/* array.add(obj); */
		
		//InventoryDetails.writeJson(array);
		
	
		
	}
	
	
	
	public static void writeJson() throws IOException
	{
		
		try {

			FileWriter writer = new FileWriter(new File("/home/user/Documents/datamanagment.json"),true);

			writer.write(array.toJSONString());
			
			writer.flush();

		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		System.out.println(array);
	}
	
	public static void readJson()
	{
		 // To convert JSONString into JSONObject
		  
		JSONParser parser = new JSONParser();

		File file = new File("/home/user/Documents/datamanagment.json");

		try (FileReader reader = new FileReader(file)) {

			Object obj = parser.parse(reader);

			JSONArray JsonArray = (JSONArray) obj;

			System.out.println("In vallid section");
			
			System.out.println(JsonArray);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  
		
	}

}
