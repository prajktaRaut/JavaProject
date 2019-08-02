package com.bridgelabz.functional;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import com.bridgelabz.utility.Utility;

/**
 * purpose: For measuring the time that elapses between the start and end clicks 
 * @author Bridgelabz
 * @version 1.8
 */

public class Stopwatch {
	

	public static void main(String[] args) {
			
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter 0 to start the stopwatch");
		
		int start= Sc.nextInt();
		
		if(start==0)
		{
			Utility.StartStopWatch();
		}
		
		System.out.println("enter 1 to stop the stopwatch");
		
		int stop = Sc.nextInt();
	
		if(stop==1)
		{
			Utility.StopStopWatch();
			double Elapsedtime=Utility.getelapsedtime();
			System.out.println("Elapsed time is "+Elapsedtime);
		}
		
		
	}

}
