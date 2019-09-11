package com.bridgelabz.oops.RegularExpression;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class RegularExpression {

	static String RegexName = "[a-zA-Z]+";
	static String RegexFullName = "[a-zA-Z]+(.*)";
	static String RegexMobileNumber="[7-9][0-9]{9}";
	static String RegexDate="([0-2][0-9]|[3][0-1])[/]([0][0-9]|[1][1-2])[/][0-9]{4}";
	
	 static String Message="Hello <<name>>, We have your full\n" + 
			"name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
			"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";


	  public static String checkName()
		{
		  System.out.println("enter the name to replace");
		  
		  String name=Utility.stringValue();
		
		  Pattern p= Pattern.compile(RegexName);
		  
		  boolean status= p.matches(RegexName, name);
		  
		  System.out.println(status);
		  
		  if(status)
		  {
			  return name;
			 
		  }
		  else
		  {
			  System.out.println("Enter proper name ");
			  return " <<name>>";
		  }
		
		  
		}
	
	  public static String checkFullName()
		{
		  System.out.println("enter the FullName to replace");
		  
		  String fullName=Utility.stringValue();
		
		  Pattern p= Pattern.compile(RegexFullName);
		  
		  boolean status= p.matches(RegexFullName, fullName);
		  
		  System.out.println(status);
		  
		  if(status)
		  {
			  return fullName;
			 
		  }
		  else
		  {
			  System.out.println("Enter proper FullName ");
			  return "<<full name>> ";
		  }
		  
		
		
		}
	  
	  public static String checkMobileNumber()
		{
		  System.out.println("enter the mobile number to replace");
		  
		  String mobileNumber=Utility.stringValue();
		
		  Pattern p= Pattern.compile(RegexMobileNumber);
		  
		  boolean status= p.matches(RegexMobileNumber, mobileNumber);
		  
		  System.out.println(status);
		  
		  if(status)
		  {
			  return mobileNumber;
			 
		  }
		  else
		  {	
			  System.out.println("Enter proper mobilenumber ");
			  
			  return "91-xxxxxxxxxx";
			  
		  }
		
		  
		}
	  
	  public static String checkDate()
		{
		 // System.out.println("enter the date to replace");
		  
		 // String date=Utility.stringValue();
		  
		  DateFormat date= new SimpleDateFormat("dd/MM/yyyy");
		  
		  // Date d= new Date();
		  Calendar cal= Calendar.getInstance();
		  
		  String d1=date.format(cal.getTime());
		
		  Pattern p= Pattern.compile(RegexDate);
		  
		  boolean status= p.matches(RegexDate, d1);
		  
		  System.out.println(d1);
		  
		  System.out.println(status);
		  
		  if(status)
		  {
			  return d1;
			 
		  }
		  else
		  {
			  System.out.println("Enter proper name ");
			  return "01/01/2016";
		  }
		
		  
		}
	  

	  public static void main(String[] args) {
	  
		  String Name=checkName();
		  
		  String FullName=checkFullName();
		  
		  String MobileNumber=checkMobileNumber();
		  
		  String Date=checkDate();
		  
		 String newmessage=Message.replaceAll("<<name>>", Name).replace("<<full name>>", FullName).replace("91-xxxxxxxxxx",MobileNumber )
				 .replace("01/01/2016", Date);
	  
		 
		  
		  System.out.println(newmessage);
		
	  }
	  
	  
	  
}
