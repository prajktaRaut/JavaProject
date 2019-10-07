package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class TempratureConverter {

	public static void main(String[] args) {
	
		try 
		{
			Scanner Sc= new Scanner(System.in);
			
			System.out.println("enter the temprature in celsius or fahrenhite");
			
			int temp=Sc.nextInt();
			
			char t=Sc.next().charAt(0);
			
			if(t!='f'&& t!='F' && t!='c' && t!='C')
			{
				System.out.println("enter proper input");
				main(args);
				return;
				
			}
			
			int result = Util.temperatureconversion(temp, t);
			
			System.out.println("Converted temprature is "+result);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
		

}
