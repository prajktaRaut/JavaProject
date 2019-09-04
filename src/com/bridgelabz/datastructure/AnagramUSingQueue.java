package com.bridgelabz.datastructure;

import com.bridgelabz.util.Util;

public class AnagramUSingQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q= new Queue<Integer>();
		
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
		
		boolean flag=true;
		
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				if(Util.StringAnagram(str[k], str[l]))
				{
				 int n1=Integer.parseInt(str[k]);
				// System.out.println(n1);
				 q.enqueue(n1);
				 int value1=q.dequeue();
				 System.out.println(value1);
				 
				 int n2=Integer.parseInt(str[l]);
				 q.enqueue(n2);
				 //System.out.println(n2);
				 int value2=q.dequeue();
				 System.out.println(value2);
				
				}
			
			}
			
			
			
		}
		

		
		
	}

}
