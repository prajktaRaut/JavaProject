package com.bridgelabz.oops.JSONInventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.text.html.parser.Parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {

	public static void main(String[] args) {

		
		  // To convert JSONString into JSONObject
		  
		  JSONParser parser = new JSONParser();
		  
		  File file = new File("/home/user/Documents/datamanagment.json");
		  
		  try (FileReader reader = new FileReader(file)) {
		  
		  Object obj = parser.parse(reader);
		  
		  JSONArray JsonArray = (JSONArray) obj;
		  
		  System.out.println(JsonArray);
		  
		  } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		  e) { e.printStackTrace(); } catch (ParseException e) { e.printStackTrace(); }
		  
		 
		// InventoryDetails.readJson();

	}

}
