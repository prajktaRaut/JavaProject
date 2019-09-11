package com.bridgelabz.oops.AddressBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class AddressBookDetails implements AddressBookInterface {

	// List<Person> list = new ArrayList<Person>();
	
	Set<Person> set= new HashSet<Person>();

	JSONParser parser = new JSONParser();

	JSONObject object = new JSONObject();

	@Override
	public void add(String firstName, String lastName, long phoneNumber, String city, String state, double zip) {

		try {

			readjson();

		} catch (Exception e) {
			e.printStackTrace();
		}

		Person p = new Person();

		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setCity(city);
		p.setState(state);
		p.setZip(zip);
		p.setPhoneNumber(phoneNumber);

		set.add(p);

		writejson();

	}

	@Override
	public void edit() {

		writejson();

	}

	@Override
	public void delete() {

		try {

			System.out.println("enter the name to delete");

			String name;

			name = Utility.bufferStringValue();

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/Documents/addressbook.json"));

			for (Object object : jsonArray) {

				Person p = new Person();

				JSONObject obj = (JSONObject) object;

				// System.out.println(obj);

				String firstName = (String) obj.get("firstName");
				p.setFirstName(firstName);
			

				String lastname = (String) obj.get("lastName");
				p.setLastName(lastname);

				long phonenumber = (long) obj.get("phoneNumber");
				p.setPhoneNumber(phonenumber);
				
				String city=(String) obj.get("city");
				p.setCity(city);
				
				String state=(String) obj.get("state");
				p.setState(state);
				
				double zip=(double) obj.get("zip");
				p.setZip(zip);
			
				boolean flag=p.getFirstName().equals(name);
				
				
				if(flag==false)
				{
					set.add(p);
					//writejson();
					
				}
				else
				{
					System.out.println(set.remove(p));
					set.remove(p);
					writejson();
				}
				
				
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

	@Override
	public void sortbyname() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sortbyzip() {
		// TODO Auto-generated method stub

	}

	public void writejson() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(set);

		try {

			FileWriter writer = new FileWriter("/home/user/Documents/addressbook.json");

			writer.write(json);

			writer.flush();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("written successfully " + json);
	}

	public void readjson() {

		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/Documents/addressbook.json"));

			for (Object object : jsonArray) {

				Person p = new Person();
			
				JSONObject obj = (JSONObject) object;
	
				System.out.println(obj);

				String firstname = (String) obj.get("firstName");
				p.setFirstName(firstname);

				String lastname = (String) obj.get("lastName");
				p.setLastName(lastname);

				long phonenumber = (long) obj.get("phoneNumber");
				p.setPhoneNumber(phonenumber);
				
				String city=(String) obj.get("city");
				p.setCity(city);
				
				String state=(String) obj.get("state");
				p.setState(state);
				
				double zip=(double) obj.get("zip");
				p.setZip(zip);
			
				set.add(p);
				
			

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
