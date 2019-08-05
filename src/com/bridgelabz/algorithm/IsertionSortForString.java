package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To sort String array using Insertion sort algorithm
 * @author Bridgelabz
 * @version 1.8
 */

public class IsertionSortForString {

	public static void main(String[] args) {
		
		Util u = new Util();
		
		Utility U = new Utility();
		
		System.out.println("enter 0 to start the stopwatch");
		
		int start= U.integerValue();
		
		if(start==0)
		{
			U.StartStopWatch();
		}
        
		String[] s1= {"angular","c","java","net","python"};
		
		u.InsertionSortForString(s1);
		
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
