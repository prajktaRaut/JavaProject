package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class DayOfDate {

	public static void main(String[] args) {
				
		int d=Integer.parseInt(args[0]);

		int m=Integer.parseInt(args[1]);
		
		int y=Integer.parseInt(args[2]);
				
		
		System.out.println("day is "+Util.dayofweek(d, m, y));
		
	}

}
