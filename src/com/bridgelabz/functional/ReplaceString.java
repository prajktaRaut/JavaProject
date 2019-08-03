package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: Replace given string with proper name
 * @author Bridgelabz
 * @version 1.8
 */
public class ReplaceString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the username");
		
		String Name=sc.nextLine();
		

		Utility.replace(Name);
		
	}

}

