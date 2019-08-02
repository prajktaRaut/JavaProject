package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: To find the root of the equation a*x*x+b*x+c
 * @author Bridgelabz
 * @version 1.8
 */

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		
		System.out.println("enter the value of c");
		double c=sc.nextDouble();
		
		
		
		/**
		 * Function to find the root of the equation and print it
		 * @param a value of a in qudratic equation a*x*x + b*x c
		 * @param b value of b in qudratic equation a*x*x + b*x c
		 * @param c value of c in qudratic equation a*x*x + b*x c
		 */
		
		Utility.quadraticEquation(a, b, c);
		
	}
}
