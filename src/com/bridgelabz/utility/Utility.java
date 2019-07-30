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
	
	public static void flipCoin(int flipse)
	{
		int head=0, tails=0;
		int counter=1;
		double RandomNum = 0.0;
		
		// loop run until counter is less than flipse value
		while(counter<flipse)
		{
			RandomNum =	Math.random();
			
			if(RandomNum < .5)
			{
				head++;
				
			}
			else
			{
				tails++;
				
			}
			counter++;
	
		}	
		System.out.println("Total number of head is "+head);
		
		System.out.println("Percentage of head is "+(float)((float)head/flipse)*100);
		 
		System.out.println("Total number of tails is "+tails);
		
		System.out.println("percentage of tails is "+(float)((float)tails/flipse)*100);
		
		
	}

	
}
