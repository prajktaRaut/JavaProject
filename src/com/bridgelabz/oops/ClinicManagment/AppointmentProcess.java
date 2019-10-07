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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class AppointmentProcess {

	List<Appointment> listOfAppointment= new ArrayList<Appointment>();
	
	JSONParser parser= new JSONParser();
	
	JsonObject object= new JsonObject();
	
	public void takeAppointment(String p_name,String d_name,String time,String date)
	{
	try {
		
		readJSON();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		Appointment a= new Appointment();
		
		a.setPatient_name(p_name);
		a.setDoctor_name(d_name);
		a.setTime(time);
		a.setDate(date);
		
		listOfAppointment.add(a);
		
		
		WriteJson();
	}

	public void WriteJson() 
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(listOfAppointment);

		try {
			readJSON();
			FileWriter writer = new FileWriter("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/appointment.json");

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

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/appointment.json"));

			for (Object object : jsonArray) {

				

				JSONObject obj = (JSONObject) object;

				Appointment a= new Appointment();
				
				String p_name=(String) obj.get("patient_name");
				a.setPatient_name(p_name);
				
				String d_name=(String) obj.get("doctor_name");
				a.setDoctor_name(d_name);
				
				String time=(String) obj.get("time");
				a.setTime(time);
				
				String date=(String) obj.get("date");
				a.setDate(date);
				
				listOfAppointment.add(a);
				
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
	
	
	public void printAppointmentReport(String patient_Name)
	{
		try {

			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/JavaWorkspace/JavaProject/src/com/bridgelabz/oops/ClinicManagment/appointment.json"));

			for (Object object : jsonArray) {

				

				JSONObject obj = (JSONObject) object;

				Appointment a= new Appointment();
				
				String p_name=(String) obj.get("patient_name");
				a.setPatient_name(p_name);
				
				String d_name=(String) obj.get("doctor_name");
				a.setDoctor_name(d_name);
				
				String time=(String) obj.get("time");
				a.setTime(time);
				
				String date=(String) obj.get("date");
				a.setDate(date);
				
				if(p_name.equals(patient_Name))
				{
					System.out.println("Patient name is " + p_name);
					System.out.println("Doctor name is " + d_name);
					System.out.println("Time alloted for patient " + p_name + " is " + time);
					System.out.println("Date of appointment is " + date);

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
