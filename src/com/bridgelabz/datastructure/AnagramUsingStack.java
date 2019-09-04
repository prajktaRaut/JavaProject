package com.bridgelabz.datastructure;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class AnagramUsingStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		int[] anagram= new int[170];
		
		int y = 0;
	
		int[] arr = new int[170];

		for (int i = 1; i <= 1000; i++) {
			boolean flag = true;

			for (int j = 2; j < i - 1; j++) {
				
				if (i % j == 0) 
				{
					flag = false;
					break;
				}
			}
			if (flag == true) {
				arr[y] = i;
				y++;
			}
			
		}
		
	
		int[] a= new int[170];
		
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}
		
		String[] array= new String[arr.length];
		
		StringBuffer sb= new StringBuffer(arr.length);
		
		String s=" ";
		
		for(int i=0;i<arr.length;i++)
		{
			s=sb.append(a[i]+" ").toString();
		}
		
		String[] str=s.split(" ");
		
		String string=" ";
	
		
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				if(Util.StringAnagram(str[k], str[l]))
				{
				 int n1=Integer.parseInt(str[k]);
				 stack.push(n1);

				
				
				 int n2=Integer.parseInt(str[l]);
				 stack.push(n2);
				}
			
			}
		}
		
		int count=0;
		
		for(int i=0;i<170;i++)
		{
		int value=stack.pop();
		System.out.println(value);
		count++;
		
		}
		
		System.out.println(count);
		
	}

}
