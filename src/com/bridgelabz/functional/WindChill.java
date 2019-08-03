package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * purpose: To find windchill
 * @author Bridgelabz
 * @version 1.8
 */


public class WindChill {

	public static void main(String[] args) {
		
		double temp = Double.parseDouble(args[0]);
		double speed=Double.parseDouble(args[1]);
		
		
		Utility.calculateWindChill(temp, speed);
		
	}
}
