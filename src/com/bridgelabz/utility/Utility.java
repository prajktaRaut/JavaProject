package com.bridgelabz.utility;

/**
 * purpose: Helper class containing important method used in another class  
 * @author Bridgelabz
 * @version 1.8
 */

public class Utility 
{
 
	
	public static void replace(String Name)
	
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

	public static void leapYear(int year)
	{
		// Here, we check the year is between 1000 and 10000 or not
		if(year>=1000 && year<=10000)
		{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("The given year is leap Year");
				}
				else
				{
					System.out.println("The given year is not leap year");
				}
				
			}
			else
			{
				System.out.println(" The given year is leap Year");
			}
		}
		else
		{
			System.out.println("The given year is not leap year");
		}
		}
		else
		{
			System.out.println("enter the proper year");
		}
		
		}
	
	public static void powerOf2(int n)
	{
		int i=0;
		int power=1;
		
		System.out.println("Table of power 2 that are less than and equal to 2^"+n);
		
		// loop run until i value is less than or equal to n value
		while(i<=n)
		{
			
		System.out.println("2^"+i+" = "+power);
		
		power=power*2;
		i++;
		
		}
	}

	public static void harmonicNumber(int n)
	{
		
		// loop execute until value of i is less than or equal to n
		
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.print("1 + ");
			}
			else if(i==n)
			{
				System.out.print("1/"+n);
			}
			else
			{
				System.out.print("1/"+i+" + ");
			}
		}
		
	}
	
	public static void findTriplet(int[] arr, int n)
	{
		boolean found= true;
		
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print(" ");
						
						System.out.println();
						
						found=true;
					}
				}
			}
		}
		
		if(found==false)
		{
			System.out.println("Does not exist");
		}
		
	}
	
	
	public static double calculateDistance(int x,int y)
	{
		// Here, we used inbuilt function sqrt to calculate square root of number 
		
		double distance=Math.sqrt(x*x + y*y);
		
		return distance;
	}
	
}
