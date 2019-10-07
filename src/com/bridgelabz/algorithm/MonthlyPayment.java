package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter the value of principal,rate and year ");
		
		double principal=Sc.nextDouble();
		double rate=Sc.nextDouble();
		double year=Sc.nextDouble();
		
		System.out.println("Monthly Payment is "+Util.monthlyPayment(principal, rate, year));
		
	}

}
