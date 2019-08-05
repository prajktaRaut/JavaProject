package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: To find prime factor of given number and print it 
 * @author Bridgelabz
 * @version 1.8
 */

public class PrimeFactorization {

	
	public static void main(String[] args) {
	
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter the number whose prime factor you want");
		
		int n =Sc.nextInt();
		
		Utility u = new Utility();
		
		u.primeFactors(n);

	}
	

}
