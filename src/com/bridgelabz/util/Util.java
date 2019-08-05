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
		
		/**
		 * Function to sort String array using binary search algorithm
		 * @param s, the array in which element to be searched
		 * @param item, the string element which needs to be searched
		 * @return -1 if not found or the index of element if found
		 */	
		
		public static int BinarySearchForString(String[] s, String item)
		{

			 int start=0;
			 int end= s.length-1;
			 
			 
			 while(start<=end)
			 {
				 int middle= (start + end)/2;
				 	
				 int res=item.compareTo(s[middle]);
				 
				 if(res==0)
				 {
					 return middle;
				 }
				 
				 else if(res>0)
				 {
					 start=middle + 1;

				 }
				 else 
				 {
					 end=middle - 1;
					 
				 }
			 }
			return -1;
		}
		
		/**
		  * Function to sort array using insertion sort
		  * @param arr the array which needs to be sorted
		  */

			public static void InsertionSortForInteger(int[] arr)
			{
				for(int i=1;i<arr.length;++i)
				{
					int key=arr[i];
					int j=i-1;
					
					
				while (j>=0 && arr[j]>key)
					{
						arr[j+1]=arr[j];
						j=j-1;
					}
					arr[j+1]= key;
				}
				
				for(int k=0;k<arr.length;k++)
				{
					System.out.println(arr[k]);
				}

		}
			
	
		/**
		* Function to sort  String array using insertion sort
		* @param arr the array which needs to be sorted
		*/

			public static void InsertionSortForString(String[] arr)
			{
				for(int i=0;i<arr.length;++i)
				{
					String key=arr[i];
					int j=i-1;
					
					while(j>=0 && arr[j].compareTo(key)>0)
					{
						arr[j+1]=arr[j];
						j=j-1;
						
					}
					arr[j+1]=key;
				}
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i] + " ");
				}
			}

		/**
		* Function to sort implementing bubble sort algorithm
		* @param arr, the array which needs to be sorted
		* 
		*/

		public static void BubbleSortForInteger(int[] arr)
		{
		
			int temp;
			
			for(int i=0;i<arr.length;i++)
			{
				int flag=0;
				for(int j=0;j<arr.length-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=1;
					}
				}
				if(flag==0)
				{
					break;
				}
			}
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]+" ");
			}
			
			
		}
		
		/**
		 * Function to sort String array implementing bubble sort algorithm
		 * 
		 */
		public static void BubbleSortForString() 
		{
			String[] a= {"java","c","angular","spring","hibernate"};
			
			String temp="";
			
			for(int j=0;j<a.length;j++)
			{

				
				for(int i=j+1;i<a.length;i++)
				{
					if(a[i].compareTo(a[j])<0)
					{
						temp=a[j];
						a[j]=a[i];
						a[i]= temp;
						
					}
					
				}
				
				System.out.println(a[j]);
			}
			
		}



		
}

