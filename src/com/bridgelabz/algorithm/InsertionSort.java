package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To sort string array using Insertion sort algorithm
 * @author Bridgelabz
 * @version 1.8
 */

public class InsertionSort {

	public static void main(String[] args)
	{
		
		String[] name= {"java","c","angular","python","hibernate","spring"};

		System.out.println("Before Sorting");
		
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("After Sorting ");
		
		Util u = new Util();
		
		u.InsertionSortForString(name);
		
	
		
	}

}
