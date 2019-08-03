package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

/**
 * purpose: Helper class containing important method used in another class  
 * @author Bridgelabz
 * @version 1.8
 */

public class Util 
{
	 
	public static void StringAnagram(String str1,String str2)
	{
		
		boolean flag=true;
		
		if(str1.length()!=str2.length())
		{
			flag=false;
		}
		else
		{
			char[] s1= str1.toLowerCase().toCharArray();
			char[] s2= str2.toLowerCase().toCharArray();
		
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			flag=Arrays.equals(s1, s2);
			
			if(flag==true)
			{
				System.out.println("Strings are anagram ");
			}
			else
			{
				System.out.println("Strings are not anagram");
			}
		}
	}

}
