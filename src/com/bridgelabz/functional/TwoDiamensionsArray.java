package com.bridgelabz.functional;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TwoDiamensionsArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of row");
		int row=sc.nextInt();
		
		System.out.println("enter the value of column");
		int column=sc.nextInt();
		
		Utility.integerArray(row, column);
		
		//Utility.booleanArray(row, column);
		
		//Utility.doubleArray(row, column);
	}
}
