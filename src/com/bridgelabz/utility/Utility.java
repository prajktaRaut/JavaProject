package com.bridgelabz.utility;

public class Utility 
{
	public static void Replace(String Name)
	
	{
		String str="Hello <<Username>>, How are you?";
		
		// Here, length() function is used to calculate the length of string
		
		if(Name.length()>=3)		
		{
				
		// Here, replace() function is used to replace the first string with second string
					
		String Newstr=str.replace("<<Username>>", Name);
				
		System.out.println(Newstr);
				
		}
		else
		{
		System.out.println("Username has minimum 3 character");
		
		}
		
		
	}
	
	
}
