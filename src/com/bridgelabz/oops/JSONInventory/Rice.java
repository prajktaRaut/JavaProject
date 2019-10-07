package com.bridgelabz.oops.JSONInventory;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class Rice {

	String Name;
	String Weight;
	String Price;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) 
	{
		System.out.println("enter the name of rice you want ");
		String Name = Utility.stringValue();
		
		System.out.println("enter the weight of rice ");
		String Weight = Utility.stringValue();
		
		System.out.println("enter the price of rice ");
		String Price =Utility.stringValue();
		
		Rice r= new Rice();
		
		r.setName(Name);
		r.setWeight(Weight);
		r.setPrice(Price);
		
		
		JSONObject object1 = new JSONObject();

		object1.put("Name", r.getName());
		object1.put("Weight", r.getWeight());
		object1.put("Price", r.getPrice());
		
		JSONArray list= new JSONArray();
		
		list.add(object1);
		
		try 
		{
			FileWriter writer= new FileWriter("/home/user/Documents/info.json",true);
		
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
