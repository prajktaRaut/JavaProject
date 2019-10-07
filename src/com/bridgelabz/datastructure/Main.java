package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class Main {

	public static void main(String[] args) 
	{
		
		File file = new File("/home/user/Documents/doc.txt");
		
		try(BufferedReader reader= new BufferedReader(new FileReader(file))) 
		{
			String line="";
			
			while(reader.ready())
			{
			line=reader.readLine();
				
			}
			
			Util ut= new Util();
		
			String[] str=line.split(" ");
			
			ut.InsertionSortForString(str);
			
		
			System.out.println();
			
			LinkedList<String> list =new LinkedList<String>();
			
			for(int i=0;i<str.length;i++)
			{
				list.append(str[i]);
			}
			
			System.out.println("enter the string to serach");
			
			Utility u = new Utility();
			
			String SearchString=u.stringValue();
				
			int result = list.search(str, SearchString);
			
		
			if(result==-1)
			{
		
				System.out.println("element not found");
				
				list.append(SearchString);
				
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
			
			list.show();
			
			System.out.println("enter the element number which you want to pop");
			int pos=Utility.integerValue();
			
			String sp=list.pop(pos);
			
			System.out.println("pop the element "+ sp +" At position "+pos);
			
			list.show();
			
			
			String s = list.pop();

			System.out.println("Last element of linked list is " + s);

			list.show();
			 
			
			}	
		catch (Exception e) 
		{
		e.printStackTrace();
		}
	
		
	}
	
			
	}
