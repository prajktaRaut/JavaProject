package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * purpose: Program to find the sum of three integer adds to zero
 * @author Bridgelabz
 * @version 1.8
 */
public class SumOf3NoAddsToZero 
{

	public static void main(String[] args) 
	{
		int[] arr = {0,-1,2,4,-3,1};
		int n= arr.length;
		
		// Function which find three value whose sum is zero
		
		Utility.findTriplet(arr, n);
		
	}

}
