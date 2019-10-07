package com.bridgelabz.algorithm;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class BinarySearchForString {

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
		
		for (int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("enter the string for search");
		
		String s=Utility.stringValue();
		
		int result=u.BinarySearchForString(s1, s);
		
		if(result==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at index "+result);
		}
		
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
