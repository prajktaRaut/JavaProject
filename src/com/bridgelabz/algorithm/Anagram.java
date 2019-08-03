package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To check two string are anagram of each other or not
 * @author Bridgelabz
 * @version 1.8
 */
public class Anagram {

	public static void main(String[] args) {
		
        
		Utility u= new Utility();
	
		System.out.println("enter first string ");
		String str1= u.stringValue();
		
		System.out.println("enter second string ");
		String str2= u.stringValue();
		
		Util U = new Util();
		
		U.StringAnagram(str1,str2);
		
	}
	

}
