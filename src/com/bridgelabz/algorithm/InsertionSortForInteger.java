package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class InsertionSortForInteger {

	public static void main(String[] args) {
		
Util u = new Util();
		
		Utility U = new Utility();
		
		System.out.println("enter 0 to start the stopwatch");
		
		int start= U.integerValue();
		
		if(start==0)
		{
			U.StartStopWatch();
		}
		
		int[] arr= {12,31,50, 21,78,10};
        
		u.InsertionSortForInteger(arr);
		
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
