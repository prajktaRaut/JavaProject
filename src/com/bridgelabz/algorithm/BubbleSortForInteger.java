package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To sort Integer array using Bubble sort algorithm
 * @author Bridgelabz
 * @version 1.8
 */

public class BubbleSortForInteger {

	public static void main(String[] args) {
		
	Util u = new Util();
		
		Utility U = new Utility();
		
		System.out.println("enter 0 to start the stopwatch");
		
		int start= U.integerValue();
		
		if(start==0)
		{
			U.StartStopWatch();
		}
        
		int[] arr= {11,33,55,22,44,88};
		
		u.BubbleSortForInteger(arr);
		
		System.out.println();
		
		System.out.println("enter 1 to stop the stopwatch");
		
		int stop = U.integerValue();
	
		if(stop==1)
		{
			U.StopStopWatch();
			double Elapsedtime=Utility.getelapsedtime();
			System.out.println("Elapsed time is "+Elapsedtime);
		}

	}

}
