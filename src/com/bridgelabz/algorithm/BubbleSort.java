package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;

/**
 * purpose: To sort integer array using bubble sort algorithm
 * @author Bridgelabz
 * @version 1.8
 */

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] arr= {12,10,25,50,78,20};
		
		System.out.println("Before sorting ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("After sorting ");
		
		Util u = new Util();
		
		u.BubbleSortForInteger(arr);

	}

}
