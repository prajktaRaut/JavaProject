package com.bridgelabz.oops.ClinicManagment;

import java.io.IOException;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class ClinicManagment {

	public static void main(String[] args) throws IOException {
		
		
		PatientsProcess p = new PatientsProcess();

		DoctorsProcess d = new DoctorsProcess();
		
		AppointmentProcess a= new AppointmentProcess();

		boolean flag = true;

		do {
			System.out.println("1. AddPatient");
			System.out.println("2. AddDoctor");
			System.out.println("3. SearchForPatient");
			System.out.println("4. SearchForDoctor");
			System.out.println("5. TakeAppointment");
			System.out.println("6. PrintAppointment");
			System.out.println("7. Exit");

			System.out.println("enter your choice");

			int choice = Utility.integerValue();

			switch (choice) {

			case 1:

				System.out.println("enter the patient id ");
				long id=Utility.longValue();

				System.out.println("enter the patient name");
				String name = Utility.bufferStringValue();

				System.out.println("enter the patient phone number");
				long number = Utility.longValue();

				System.out.println("enter the patient age");
				long age=Utility.longValue();

				p.addPatietnts(id, name, number, age);

				break;

			case 2:

				System.out.println("enter the doctor id");
				long d_id=Utility.longValue();

				System.out.println("enter the doctor name");
				String d_name = Utility.bufferStringValue();

				System.out.println("enter the doctor specialization");
				String specialization = Utility.bufferStringValue();

				System.out.println("enter the doctor availability");
				String availability = Utility.bufferStringValue();

				d.addDoctors(d_id, d_name, specialization, availability);

				break;

			case 3:
				
				boolean status=true;
				
				do
				{
					System.out.println("1. SearchById");
					System.out.println("2. SearchByName");
					System.out.println("3. SearchByMobileNumber");
					System.out.println("4. Exit");
					System.out.println("enter your choice");
					int c= Utility.integerValue();
					
					switch (c) {
					case 1:
						
						System.out.println("enter the patient id ");
						long patient_id=Utility.longValue();
						
						p.searchById(patient_id);
						
						break;

					case 2:
						
						System.out.println("enter the patient name");
						String patient_name = Utility.bufferStringValue();
						
						p.searchByName(patient_name);
						
						break;
						
					case 3:
						
						System.out.println("enter the patient phone number");
						long patient_number = Utility.longValue();
	
						p.searchByPhoneNumber(patient_number);
						
						break;
					
					case 4:
						status = false;

						break;
						
					default:
						break;
					}
					
					
				}
				while(status);
				break;

			case 4:
				
				boolean Status=true;
				
				do
				{
					System.out.println("1. SearchByName");
					System.out.println("2. SearchBySpecialization");
					System.out.println("3. SearchByAvailability");
					System.out.println("4. Exit");
					System.out.println("enter your choice");
					int c= Utility.integerValue();
					
					switch (c) {
					case 1:
						
						System.out.println("enter the doctor name");
						String doctor_name = Utility.bufferStringValue();
						
						d.searchByName(doctor_name);
						
						break;

					case 2:
						
						
						System.out.println("enter the doctor specialization");
						String doctor_specialization = Utility.bufferStringValue();
						
						d.searchBySpecialization(doctor_specialization);
						
						break;
						
					case 3:
	
						System.out.println("enter the doctor availability");
						String doctor_availability = Utility.bufferStringValue();
						
						d.searchByAvailability(doctor_availability);
						
						break;
					
					case 4:
						Status = false;

						break;
						
					default:
						break;
					}
					
					
				}
				while(Status);
			
			case 5:
				
				System.out.println("enter patient name");
				String patientName=Utility.bufferStringValue();
				
				System.out.println("enter doctor name ");
				String doctorname=Utility.bufferStringValue();
				
				System.out.println("enter the time");
				String time=Utility.bufferStringValue();
				
				System.out.println("enter the date");
				String date= Utility.bufferStringValue();

				a.takeAppointment(patientName, doctorname, time, date);
			
				break;
				
				
			case 6:
				
				System.out.println("enter the patient name whose appointment report you want ");
				
				String patient_Name=Utility.bufferStringValue();
				
				a.printAppointmentReport(patient_Name);
				
				
			case 7:
				flag = false;	

				break;
				
				
			default:
				System.out.println("enter proper input");
				break;
			}

		} while (flag);

	}
}
