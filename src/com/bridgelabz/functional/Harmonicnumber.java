package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: Print the nth harmonic number series 1/1 + 1/2 + .... +1/n
 * @author Bridgelabz
 * @version 1.8
 */

public class Harmonicnumber {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the nth value of harmonic series");
		
		int n=sc.nextInt();
				
		Utility.harmonicNumber(n);
		
	}

}
