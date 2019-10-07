package com.bridgelabz.algorithm;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.bridgelabz.util.Util;

public class SearchWord {

	public static int search(String[] a,String s)
	{
		
		int start=0;
		int end=a.length-1;
		int mid=(start+end)/2;
		
		while(start<=end)
		{
			 mid=(start+end)/2;
			
			int res= s.compareTo(a[mid]);
			
			System.out.println(res);
			
			if(res==0)
			{
				return mid;
			}
			else if(res>0)
			{
				start= mid +1;
			}
			else
			{
				end= mid-1;
			}
			
		}
		return -1;

	}
	
	public static void main(String[] args) {
		
		File f = new File("C:/Users/SHRI/Documents/doc.txt");
		
		try (BufferedReader reader= new BufferedReader(new FileReader(f)))
		{
		
				String str=" ";
				
				ArrayList<String> arr= new ArrayList<>();
				
				while(reader.ready())
				{
					str=reader.readLine();
				}
				
				Scanner sc = new Scanner(System.in);
				
				String[] s=str.split(" ");
				
				System.out.println("enter the string for search");
				
				String string = sc.nextLine();
				
				int result=search(s, string);		
				
				if(result==-1)
				{
					System.out.println("Search string is not found");
				}
				else
				{
					System.out.println("Search string is found at index "+result);
				}
		}
		
		catch (Exception e) 
		{

			e.printStackTrace();
		}
		
		
	
	

	}
	

}
