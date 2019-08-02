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
	
	
	public static void quadraticEquation(double a,double b,double c)
	{
		double root1, root2;
		
		double Determinant = b*b - 4*a*c;
		
		//Here, we check determinant value to find root of equation 
		
		if(Determinant>0)
		{
			root1=(-b - Math.sqrt(Determinant))/2*a;
			root2=(-b + Math.sqrt(Determinant))/2*a;
			
			System.out.println("Root1= "+root1%.2f +"Root2= "+root2%.2f );
		}
		
		if(Determinant==0)
		{
			root1=root2=-b/2*a;
			
			System.out.println("Root1=Root2= "+root1%.2f);
		}
		else
		{
			double realpart=-b/2*a;
			double imaginarypart=Math.sqrt(-Determinant)/2*a;
			
			System.out.println("root1= "+realpart+"+"+imaginarypart+"i");
			System.out.println("root2= "+realpart+"-"+imaginarypart+"i");
		}
		
	}
	
	
	public static void calculateWindChill(double temp,double speed)
	{
       double Wind;
		
		if(temp<50 && (speed>3 || speed<120))
		{
		  Wind=35.74+0.6215*temp+(0.42*temp-35.75)*Math.pow(speed, 0.16);
		  
		  System.out.println("Wind Chill is "+Wind);
		}
		else
		{
			System.out.println("Input proper value ");
		}
		
	}
	
}

