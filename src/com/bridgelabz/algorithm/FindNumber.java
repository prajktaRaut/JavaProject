package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FindNumber {

	public static int search(int low,int high)
	{
		Scanner Sc= new Scanner(System.in);
		
		if((high-low)==1)
			return low;
		int mid=(low+(high-low))/2;
		
		System.out.println("Is it less than "+mid);
		
		boolean status=Sc.nextBoolean();
		
		if(true)
		{
			return search(low,mid);
		}
		else 
		{
			return search(high,mid);
		}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		int i= Integer.parseInt(args[0]);
		
		int n= (int) Math.pow(2,i);
		
		System.out.println("Think of integer between 0 to "+(n-1));
		
		int Number= search(0,n);
		
		System.out.println("Your number is "+Number);
		
		
		
	}
	

}
