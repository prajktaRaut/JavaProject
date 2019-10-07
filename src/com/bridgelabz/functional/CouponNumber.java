package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: To find the coupon number
 * @author Bridgelabz
 * @version 1.8
 */
public class CouponNumber {

	public static void main(String[] args) {
		
		
		// char array to get characters for coupon

		char[] chars = "abcdefghijklmnop".toCharArray();

		// length of coupon

		int max = 100000000;

		System.out.println("enter the how many coupon number do you have ");
		
		int n=Utility.integerValue();
		
		for(int i=0;i<n;i++)	
		{
			// random value
		double d = Math.random();
		int random = (int) (d * max);
		String sb = "";

		while (random > 0) {
			
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
			
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
		}
	}
		
	}

