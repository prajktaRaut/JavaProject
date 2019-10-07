package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter number to convert into binary ");
		
		int n=Sc.nextInt();
		
		System.out.println("Binary of number "+n+" is "+Util.toBinary(n));
		

	}

}
