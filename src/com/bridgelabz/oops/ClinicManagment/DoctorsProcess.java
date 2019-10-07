package com.bridgelabz.oops.ClinicManagment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class DoctorsProcess {

	List<Doctor> listOfDoctors= new ArrayList<Doctor>();
	
	JSONParser parser= new JSONParser(); 
	
	JsonObject object= new JsonObject();
	
	public void addDoctors(long id,String name,String specialization,String availability)
	{
		
		try {

			readjson();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		Doctor d= new Doctor();
		
		d.setDoctor_id(id);
		d.setDoctor_name(name);
		d.setDoctor_specialization(specialization);
		d.setDoctor_availability(availability);
		
		listOfDoctors.add(d);
		
		WriteJson();
	
		
	}

	public void WriteJson() 
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(listOfDoctors);

		try {

			FileWriter writer = new FileWriter("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/doctor.json");

			writer.write(json);

			writer.flush();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("written successfully " + json);
		
	}
	
	public void readjson() {
		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/doctor.json"));

			for (Object object : jsonArray) {

				Doctor d = new Doctor();

				JSONObject obj = (JSONObject) object;

				long id= (long) obj.get("doctor_id");
				d.setDoctor_id(id);

				String name = (String) obj.get("doctor_name");
				d.setDoctor_name(name);

				String specialization = (String) obj.get("doctor_specialization");
				d.setDoctor_specialization(specialization);

				String availability = (String) obj.get("doctor_availability");
				d.setDoctor_availability(availability);

				listOfDoctors.add(d);

				System.out.println(obj);

			}

		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catchblock
			e.printStackTrace();
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void searchByName(String searchName)
	{
		try {
			
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/doctor.json"));

			for (Object object : jsonArray) {

				Doctor d = new Doctor();
				
				JSONObject obj = (JSONObject) object;
				
				long id= (long) obj.get("doctor_id");
				d.setDoctor_id(id);
				
				String name = (String) obj.get("doctor_name");
				d.setDoctor_name(name);

				String specialization = (String) obj.get("doctor_specialization");
				d.setDoctor_specialization(specialization);

				String availability = (String) obj.get("doctor_availability");
				d.setDoctor_availability(availability);
				
				if(name.equals(searchName))
				{
					System.out.println(obj);

				}
				
				
			}
			
			
		}  catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catchblock
			e.printStackTrace();
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	
	public void searchBySpecialization(String searchName)
	{
		try {
			
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/doctor.json"));

			for (Object object : jsonArray) {

				Doctor d = new Doctor();
				
				JSONObject obj = (JSONObject) object;
				
				long id= (long) obj.get("doctor_id");
				d.setDoctor_id(id);
				
				String name = (String) obj.get("doctor_name");
				d.setDoctor_name(name);

				String specialization = (String) obj.get("doctor_specialization");
				d.setDoctor_specialization(specialization);

				String availability = (String) obj.get("doctor_availability");
				d.setDoctor_availability(availability);
				
				if(specialization.equals(searchName))
				{
					System.out.println(obj);

				}
				
				
			}
			
			
		}  catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catchblock
			e.printStackTrace();
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public void searchByAvailability(String searchName)
	{
		try {
			
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/doctor.json"));

			for (Object object : jsonArray) {

				Doctor d = new Doctor();
				
				JSONObject obj = (JSONObject) object;
				
				long id= (long) obj.get("doctor_id");
				d.setDoctor_id(id);
				
				String name = (String) obj.get("doctor_name");
				d.setDoctor_name(name);

				String specialization = (String) obj.get("doctor_specialization");
				d.setDoctor_specialization(specialization);

				String availability = (String) obj.get("doctor_availability");
				d.setDoctor_availability(availability);
				
				if(availability.equals(searchName))
				{
					System.out.println(obj);

				}
				
				
			}
			
			
		}  catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catchblock
			e.printStackTrace();
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
}
