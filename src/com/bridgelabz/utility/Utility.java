package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * purpose: Helper class containing important method used in another class  
 * @author Bridgelabz
 * @version 1.8
 */

public class Utility 
{
	
	static Scanner scanner= new Scanner(System.in);
	static InputStreamReader reader= new InputStreamReader(System.in);
	static BufferedReader read= new BufferedReader(reader);
	
	
	public static int integerValue()
	{
		int integer= scanner.nextInt();
		return integer;
	}
	
	
	public static String stringValue()
	{
		
		String string = scanner.nextLine();
		return string;
	}

	
	public static char characterValue()
	{
		char character= scanner.next().charAt(0);
		return character;
	}

	
	public static float floatValue()
	{
		float floatvalue= scanner.nextInt();
		return floatvalue;
	}

	
	public static double doubleValue()
	{
		double doublevalue= scanner.nextInt();
		return doublevalue;
	}
	

	public static boolean booleanValue()
	{
		boolean booleanValue= scanner.nextBoolean();
		return booleanValue;
	}
	
	public static String bufferStringValue() throws IOException
	{
		String str= read.readLine();
		return str;
	}
	
	public static long longValue()
	{
		long longValue= scanner.nextLong();
		return longValue;
	}
	
	
	
	/**
	 * Function for replace string with username 
	 * @param Name, string for replace
	 */
	
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
	
	
	/**
	 * Function to find the percenatge of head and tail
	 * @param flipse, the value for no of times flipse
	 */

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
	

	/**
	 *  Function to find the given year is leap year or not
	 *  @param year, the value of year to check
	 */
	
	public static boolean leapYear(int year)
	{
		boolean flag=true;
		
		// Here, we check the year is between 1000 and 10000 or not
		if(year>=1000 && year<=10000)
		{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
				flag=true;
				}
				else
				{
					flag=false;
				}
				
			}
			else
			{
				flag=true;
			}
		}
		else
		{
			flag=false;
		}
		}
		else
		{
			System.out.println("enter the proper year");
		}
		return flag;
		
		}
	
	
	/**
	 * Function to find the table of power of 2
	 * @param n, the value for no of times table of power of 2 is printed
	 */
	
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

	
	/**
	 * Function to print harmonic number series
	 * @param n, value of nth harmonic number series
	 */

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

	/**
	 * To find prime factor of given number and print it
	 * @param n, the no for which to find the prime factors
	 */
	public static void primeFactors(int n) 
    { 
       
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
  
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        if (n > 2) 
            System.out.print(n); 
    } 
	
	/**
	 * Function to find the three element whose sum is equal to zero
	 * @param arr, an array of integer
	 * @param n, length of the array
	 */
	
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
	
	
	/**
	 * Function to calculate distance between starting and end point
	 * @param x, starting point
	 * @param y, end point
	 * @return distance value
	 */
	
	public static double calculateDistance(int x,int y)
	{
		// Here, we used inbuilt function sqrt to calculate square root of number 
		
		double distance=Math.sqrt(x*x + y*y);
		
		return distance;
	}
	

	/**
	 * Permutation function
	 * @param str string to calculate permutation
	 * @param s starting index
	 * @param e end index
	 */
	
	public static void FindPermutation(String str,int s, int e)
	{
		if(s==e)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=s;i<=e;i++)
			{
				str=swap(str,s,i);
				FindPermutation(str, s+1, e);
				str=swap(str,s,i);
				
			}
		}	
		
	}
	

	/**
	 * Swap character at position 
	 * @param str string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	
	public static String swap(String str, int i,int j)
	{
		char temp;
		
		char[] tempArray=str.toCharArray();
		
		temp=tempArray[i];
		tempArray[i]=tempArray[j];
		tempArray[j]=temp;
		
		return String.valueOf(tempArray);
		
	}
	
	
	/**
	 * Function to find the root of the equation and print it
	 * @param a value of a in qudratic equation a*x*x + b*x + c
	 * @param b value of b in qudratic equation a*x*x + b*x + c
	 * @param c value of c in qudratic equation a*x*x + b*x + c
	 */
	
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
	
	
	/**
	 * Function to calculate Windchill
	 * @param temp double value of temprature in fahrenhite
	 * @param speed double value of Windspeed in milies per second
	 */
	
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
	
	/**
	 *  Static variable for storing start and end time 
	 */
	
	static long StartTime;
	static long StopTime;
	
	
	/**
	 * Function to get start time
	 */
	
	public static void StartStopWatch()
	{
		 StartTime =  System.currentTimeMillis();
		
	}
	
	
	/**
	 * Function to get stop time 
	 */
		public  static void StopStopWatch()
	{
		 StopTime= System.currentTimeMillis();
		 
		
	}
	
		
	/**
	 * Function to calculate elapsed time between start and stop time
	 * @return elapsed time
	 */
	 
	public static double getelapsedtime()
	{
		double ElapsedTime=(StopTime-StartTime)/1000;
		return ElapsedTime;
	}
	
	/** Function to count and print currency notes 
	 * 
	 * @param amount, value for which we have to find currency notes
	 */
    public static void countCurrency(int amount) 
    { 
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[9]; 
       
        // count notes
        for (int i = 0; i < 9; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        // Print notes 
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 9; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
    } 
    
    /**
     * Function to simulate gambler
     * @param stake, the amount which you have
     * @param goal, the value which to reach to win the gamble
     * @param trials, number of trials to perform
     */
    
    public static void findgambler(int stake,int goal,int trials)
    {
		int bets = 0; // total number of bets made
		int wins = 0; // total number of games won

		// repeat trials times
		for (int t = 0; t < trials; t++) {

			// do one gambler's ruin simulation
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)
				wins++; // did gambler go achieve desired goal?
		}

		// print results
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
 
    
    public static void integerArray(int row, int column)
	{
		int[][] arr= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=Utility.integerValue();
			}
			
		}
		
		PrintWriter pw= new PrintWriter(System.out);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
		
		
		pw.close();
	}
    
    public static void doubleArray(int row, int column)
	{
		double[][] arr= new double[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=Utility.doubleValue();
			}
			
		}
		
		PrintWriter pw= new PrintWriter(System.out);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print((double)arr[i][j]);
			}
			pw.println();
		}
		
		
		pw.close();
	}
    
    public static void booleanArray(int row, int column)
	{
		boolean[][] arr= new boolean[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=Utility.booleanValue();
			}
			
		}
		
		PrintWriter pw= new PrintWriter(System.out);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
		
		
		pw.close();
	}
    
}

