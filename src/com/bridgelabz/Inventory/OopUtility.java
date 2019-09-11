package com.bridgelabz.oops.Inventory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OopUtility {

	static List<ProductList> list= new ArrayList<ProductList>();
	static JSONParser parser= new JSONParser();
	static JSONObject object = new JSONObject();
	
	public static void readfile()
	{
		JSONArray jsonArray;
		
		try 
		{
			jsonArray=(JSONArray)parser.parse(new FileReader("/home/user/Documents/datamanagment.json"));
			
			for (Object object : jsonArray) {
				
				ProductList productlist= new ProductList();
				
				JSONObject obj=(JSONObject) object;
				
				System.out.println(obj);
				
				String ProductName= (String) obj.get("InventoryName");
				productlist.setProductName(ProductName);
				
				String name=(String) obj.get("Name");
				productlist.setName(name);
				
				double weight= (double) obj.get("Weight");
				productlist.setWeight(weight);
				
				double price=(double) obj.get("Price");
				productlist.setPrice(price);
				
				list.add(productlist);
				
				
				
			}
			
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void writefile()
	{
		Gson gson= new GsonBuilder().setPrettyPrinting().create();
		
		String json= gson.toJson(list);
		
		try 
		{
			FileWriter writer = new FileWriter("/home/user/Documents/datamanagment.json");
			
			writer.write(json);
			
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Inventries Details is "+json);
	}
	
	
	  public static void calculateInventory() {
	  
		 // ProductList productlist= new ProductList();
		  
		  list.forEach( productlist -> 
		  {
			  System.out.println("Inventory value is "+productlist.getWeight()*productlist.getPrice());
		  });
		  
		  
	  }
	  
	  public static void addInventory(String InventoryName, String name, double weight, double price)
	  {
		  try {
			
			  readfile();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		  
		  ProductList productlist= new ProductList();
		  
		  productlist.setProductName(InventoryName);
		  productlist.setName(name);
		  productlist.setWeight(weight);
		  productlist.setPrice(price);
		  
		  list.add(productlist);
		  
		  writefile();
		  
		 
		  
	  }
	 
}
