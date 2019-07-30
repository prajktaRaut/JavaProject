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
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter the username");
		
		String Name=Sc.nextLine();
		
		Utility u= new Utility();
		
		// Here, Replace() is a userdefined function to replace the given string
		
		u.Replace(Name);
		
	}

}

