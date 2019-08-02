package com.bridgelabz.functional;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.bridgelabz.utility.Utility;

/**
 * purpose: Flip coin and Print percentage of Head and Tails
 * @author Bridgelabz
 * @version 1.8
 */


public class FlipCoin {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of flipse do you want");
		
		int flipse=sc.nextInt();
		
		/*
		 * Function to find the percentage of
		 * 		Head and Tails
		 * @param flipse, the value for number of times flip
		 */
		
		Utility.flipCoin(flipse);
	
		
		
		

	}

}
