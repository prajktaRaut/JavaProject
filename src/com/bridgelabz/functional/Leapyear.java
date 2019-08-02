package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


/**
 * purpose: Find the year is leap year or not
 * @author Bridgelabz
 *	@version 1.8
 */

public class Leapyear {

	public static void main(String[] args) {
		
	Scanner Sc= new Scanner(System.in);
	
	System.out.println("enter the year");
	
	int year=Sc.nextInt();
	
	/**
	 *  Function to find the given year is leap year or not
	 *  @param year, the value of year to check
	 */
	
	Utility.leapYear(year);
	
	}
}
