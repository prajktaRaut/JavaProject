package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: To find permutation of the string
 * @author Bridgelabz
 * @version 1.8
 */

public class StringPermutation {

	
	public static void main(String[] args) 
	{
		
		Utility u = new Utility();
		
		System.out.println("enter the string for permutation");
		
		String str=u.stringValue();
		
		int n = str.length();
		
		u.FindPermutation(str, 0, n-1);
		

	}

}
