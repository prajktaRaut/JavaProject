package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: 
 * @author Bridgelabz
 * @version 1.8
 */

public class VendingMachine {

	public static void main(String[] args) {
		
		System.out.println("enter the amount ");
		
		int amount=Utility.integerValue();
		
		Utility.countCurrency(amount);

	}

}
