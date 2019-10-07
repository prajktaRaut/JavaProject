package com.bridgelabz.oops.StockReport;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.Inventory.ProductList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockDetails {

	static List<StockInformation> list= new ArrayList<StockInformation>();
	
	static JSONObject object= new JSONObject();
	
	static JSONParser parser= new JSONParser();
	
	public static void readfile()
	{
		JSONArray jsonArray;
		
		try {
			
			jsonArray=(JSONArray)parser.parse(new FileReader("/home/user/Documents/stockinfo.json"));
			
			for (Object object : jsonArray) {
				
				StockInformation info= new StockInformation();
				
				JSONObject obj=(JSONObject) object;
				
				System.out.println(obj);
				
				String stockName= (String) obj.get("stockName");
				info.setStockName(stockName);
				
				double shares=(double) obj.get("sharenumber");
				info.setSharenumber(shares);
				
				double Price= (double) obj.get("sharePrice");
				info.setSharePrice(Price);
				
				
				
				list.add(info);
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
			FileWriter writer = new FileWriter("/home/user/Documents/stockinfo.json");
			
			writer.write(json);
			
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Inventries Details is "+json);
	}
	
	public static void calculateStock() {
		  
		 // ProductList productlist= new ProductList();
		  
		  list.forEach( info -> 
		  {
			  System.out.println("Inventory value is "+info.getSharenumber()*info.getSharePrice());
		  });
		  
		  
	  }
	
	  public static void addStock(String stockName, double number, double price)
	  {
		  try {
			
			  readfile();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		  StockInformation info= new StockInformation();
		  
		  info.setStockName(stockName);
		  info.setSharenumber(number);
		  info.setSharePrice(price);
		  
		  list.add(info);
		  
		  writefile();
		  
		 
		  
	  }
	
	
}


