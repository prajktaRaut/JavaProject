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
	/**
	 * Function to check strings are anagram or not
	 * @param str1, String value for check
	 * @param str2, String value for check
	 */
	 
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

		/**
		 * function to print prime number from 1 to 1000
		 */
		public static void primenumber()
		{
			for(int i=2;i<=1000;i++)
			{
				boolean flag=true;
				
				for(int j=2;j<=i-1;j++)
				{
					if(i%j==0)
					{
						flag=false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.println(i);
				}
			}
			
		}

		/**
		 * Function to check given prime number is palindrome or not 
		 */
		
		public static void PrimeNumberValidation()
		{
			
			
			for(int i=2;i<=1000;i++)
			{
				boolean flag=true;
				
				for(int j=2;j<i-1;j++)
				{
					if(i%j==0)
					{
						flag=false;
						break;
					}
				}
				
				if(flag==true)
				{
					int temp=i;
					int rem=0,rev = 0;
					
					while(temp!=0)
					{
						rem=temp%10;
						rev=rev*10+rem;
						temp=temp/10;
					}
					
					if(rev==i)
					{
						System.out.println(i+ " The number is palindrome number");
					}
					else
					{
						System.out.println(i+ " The number is not palindrome number");
					}
				}
			}
			
			
		}
		
		/**
		 * Function to sort integer array using binary search algorithm 
		 */
		
		
		public static void BinarySearchInteger()
		{
			
			int[] arr= {11,22,33,44,55,66,77};
			
			int start=0;
			int end = arr.length-1;
			int middle=(start + end)/2;
			int item=55;
			
			while(start<=end)
			{
				if(arr[middle]==item)
				{
					System.out.println("Item is found at index "+middle);
					break;
				}
				else if(item>arr[middle])
				{
					start=middle+1;
				}
				else if(item<arr[middle])
				{
					end= middle-1;
				}
				middle = (start + end)/2;  	
				
			}
			
			if(start>end)
			{
			System.out.println("Item not found");	
			}
			
		}
		
}

