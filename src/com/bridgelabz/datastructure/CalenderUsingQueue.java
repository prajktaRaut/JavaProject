package com.bridgelabz.datastructure;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class CalenderUsingQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q= new Queue<Integer>();
		
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Converting string to integer 

		//int day = Integer.parseInt(args[0]);
		
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);

		// Checking given year is leap year or not 

		if (month == 2 && Utility.leapYear(year)) {
			days[month] = 29;
		}

		// Use inbuilt method for week decision

		int d = Util.dayofweek(1, month, year);

		int[][] arr = new int[6][7];

		// date start from 1

		int z = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = d; j < 7; j++) {
				if (z <= days[month]) {
					arr[i][j] = z;
					z++;
				}
			}
			d = 0;
		}

		for (int j = 0; j < d; j++) {
			arr[0][j] = arr[5][j];
		}

		System.out.println(" " + months[month] + " " + 1 + " " + year);

		System.out.println(
				"Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat" + "\t");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] != 0)
				{
					System.out.print(arr[i][j] + "\t ");
					q.enqueue(arr[i][j]);
				}	
				else
					System.out.print("\t ");
			}
			System.out.println("\n----------------------------------------------------");
		}

	}

}
