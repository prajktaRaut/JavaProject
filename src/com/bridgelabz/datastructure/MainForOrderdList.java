package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class MainForOrderdList {

	public static void main(String[] args) {
		
		OrderdLinkedList<Integer> list= new OrderdLinkedList<>();
		
		int[] a=list.readFile();
		
		int[] arr=list.sort(a);
		
		for(int i1=0;i1<a.length;i1++)
		{
			System.out.println(arr[i1]);
		}
				
		for(int j=0;j<a.length;j++)
		{
			list.append(arr[j]);
		}
		
	
			System.out.println("enter the element to serach");
			
			int i=Utility.integerValue();
			
			Utility u = new Utility();
			
			String SearchString=u.stringValue();
			
			

				
			int result = list.search(arr,i);
			
		
			if(result==-1)
			{
		
				System.out.println("element not found");
				
				list.append(i);
				
				list.show();
				
				list.writeOnFile();
				
			}
			else
			{
				System.out.println("element found at index "+result);
				list.remove(result);
				
				list.show();
				
				list.writeOnFile();	
				
				int n=list.index(SearchString);
				System.out.println("index of search element"+ SearchString + " is "+ n);
				
			}
			
			int size=list.size();
			System.out.println("The size of linked list is "+size);
			
		
			}
					 
	

	
	}
	

	

