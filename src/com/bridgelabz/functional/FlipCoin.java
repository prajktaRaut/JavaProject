package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
/**
 * purpose: Flip coin and Print percentage of Head and Tails
 * @author Bridgelabz
 * @version 1.8
 */


public class FlipCoin {

	public static void main(String[] args) {
		
		
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("enter the number of flipse do you want");
		
		int flipse=Sc.nextInt();
		
		/*
		 * Function to find the percentage of
		 * 		Head and Tails
		 * @param flipse, the value for number of times flip
		 */
		
		Utility.flipCoin(flipse);
	
		
		

	}

}
