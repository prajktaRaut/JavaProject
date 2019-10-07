package com.bridgelabz.oops.Basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.AddressBook.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class Utility {

	static List<Employee> list= new ArrayList<Employee>();
	
	static JSONParser parser= new JSONParser();
	
	static ObjectMapper mapper;
	
	static
	{
		mapper= new ObjectMapper();
		
	}
	
	public static void convertJavaObjectToJson()
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(list);

		
		try {
			
			FileWriter writer= new FileWriter("/home/user/Documents/addressbook.json");
			
			mapper.writeValueAsString(json);
			
			writer.write(json);
			
			writer.flush();
			
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}
		catch (JsonParseException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(json);
	}
	
	public static void convertJsonToJavaObject()
	{
		/*
		 * T result=null;
		 * 
		 * try { result=mapper.readValue(f=new
		 * File("/home/user/Documents/addressbook.json"), cls); } catch
		 * (JsonMappingException e) { e.printStackTrace(); } catch (JsonParseException
		 * e) { e.printStackTrace(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		//return result;
		
		JSONArray jsonArray;
		try {
			
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/Documents/addressbook.json"));
			
			for (Object object : jsonArray) {

				Employee e= new Employee();
				
				JsonObject obj= (JsonObject) object;
				
				System.out.println(obj);
				
			}
			
			
			
		} catch (IOException | ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
			

			
	}
	
	public static void add()
	{
		Employee emp=new Employee();
		
		emp.setEmp_id(101);
		emp.setEmp_name("Apurva");
		emp.setEmp_salary(20000);
		
		list.add(emp);
		
		convertJavaObjectToJson();
		
	}
	
	
}
