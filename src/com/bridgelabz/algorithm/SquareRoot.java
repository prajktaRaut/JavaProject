package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class SquareRoot {

	public static void main(String[] args) {
		
		try 
		{
			Scanner Sc= new Scanner(System.in);
			
			System.out.println("enter number to find square root ");
			
			double n=Sc.nextDouble();
			
			System.out.println("Square Root is "+Util.squareRoot(n));
			
		} 
		catch (Exception e) 
		{
			System.out.println("enter integer value "+e.getMessage());
		}
	}

}
