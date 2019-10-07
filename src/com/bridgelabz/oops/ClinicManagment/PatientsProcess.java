package com.bridgelabz.oops.ClinicManagment;

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

import com.bridgelabz.oops.AddressBook.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class PatientsProcess {

	List<Patient> listOfPatients= new ArrayList<Patient>();
	
	JSONParser parser= new JSONParser();
	
	JsonObject object= new JsonObject();
	
	public void addPatietnts(long id,String name,long number,long age)
	{
	try {
		
		readJSON();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		
		Patient p = new Patient();
		
		p.setPatient_id(id);
		p.setPatient_name(name);
		p.setPatient_phoneNumber(number);
		p.setPatient_age(age);
		
		listOfPatients.add(p);
		
		WriteJson();
	
		
	}

	public void WriteJson() 
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(listOfPatients);

		try {
			readJSON();
			FileWriter writer = new FileWriter("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/patient.json");

			writer.write(json);

			writer.flush();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("written successfully " + json);
		
	}
	
	public void readJSON()
	{
		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/patient.json"));

			for (Object object : jsonArray) {

				

				JSONObject obj = (JSONObject) object;

				Patient p = new Patient();
				
				long id= (long) obj.get("patient_id");
				p.setPatient_id(id);
				
				String name=(String) obj.get("patient_name");
				p.setPatient_name(name);
				
				long number=(long) obj.get("patient_phoneNumber");
				p.setPatient_phoneNumber(number);
				
				long age= (long) obj.get("patient_age");
				p.setPatient_age(age);
				
				listOfPatients.add(p);
			
				System.out.println(obj);

				
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
	
	public void searchById(long p_id)
	{
	
	try {

		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/patient.json"));

		for (Object object : jsonArray) {

			JSONObject obj = (JSONObject) object;

			Patient p = new Patient();
			
			long id= (long) obj.get("patient_id");
			p.setPatient_id(id);
			
			String name=(String) obj.get("patient_name");
			p.setPatient_name(name);
			
			long number=(long) obj.get("patient_phoneNumber");
			p.setPatient_phoneNumber(number);
			
			long age= (long) obj.get("patient_age");
			p.setPatient_age(age);
			
			if(id==p_id)
			{
			System.out.println(obj);
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
	
	public void searchByName(String p_name)
	{
	
	try {
		
		int flag=1;

		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/patient.json"));

		for (Object object : jsonArray) {

			JSONObject obj = (JSONObject) object;

			Patient p = new Patient();
			
			long id= (long) obj.get("patient_id");
			p.setPatient_id(id);
			
			String name=(String) obj.get("patient_name");
			p.setPatient_name(name);
			
			long number=(long) obj.get("patient_phoneNumber");
			p.setPatient_phoneNumber(number);
			
			long age= (long) obj.get("patient_age");
			p.setPatient_age(age);
			
			if(name.equals(p_name))
			{
				System.out.println(obj);
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
	

	public void searchByPhoneNumber(long p_number)
	{
	
	try {
	

		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/patient.json"));

		for (Object object : jsonArray) {

			JSONObject obj = (JSONObject) object;

			Patient p = new Patient();
			
			long id= (long) obj.get("patient_id");
			p.setPatient_id(id);
			
			String name=(String) obj.get("patient_name");
			p.setPatient_name(name);
			
			long number=(long) obj.get("patient_phoneNumber");
			p.setPatient_phoneNumber(number);
			
			long age= (long) obj.get("patient_age");
			p.setPatient_age(age);
			
			if(number== p_number)
			{
				System.out.println(obj);
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

	
	
}


