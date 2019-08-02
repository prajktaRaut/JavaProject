package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * purpose: Program to calculate the distance between two points
 * @author Bridgelabz
 * @version 1.8
 */

public class Distance
{

	public static void main(String[] args) {


		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		/**
		 *  Function to calculate distance between x and y
		 *  @param x & y is the value of two point
		 */
		
		
		double result=Utility.calculateDistance(x, y);
		
		System.out.println("Distance from "+(x+","+y)+ " from "+(0+","+0)+ " is = "+result);
	}

}
