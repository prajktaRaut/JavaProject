package com.bridgelabz.datastructure;

import java.io.File;
import java.util.Scanner;

public class OrderdListForHashing {

	Node head;
	
	public class Node
	{
		int data;
		Node next=null;
	}
	
	public void append(int data)
	{
		Node node= new Node();
		 node.data=data;
		 node.next=null;
		 
		 Node n=head;
		 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node current = head;
			 Node temp=null;
			 
			 while(current!=null && (current.data<node.data))
			 {
				 temp=current;
				 current=current.next;
			 }
			 node.next=current;
			 temp.next=node;
			
		 }
		
	}
	
	public static int[] readFile()
	{
	try 
	{
		File f= new File("/home/user/Documents/number.txt");
		
		Scanner sc= new Scanner(f);
		
		int count=0;
		
		while(sc.hasNextInt())
		{
			count++;
			sc.nextInt();
		}
		
		int[] arr= new int[count];
		
		Scanner s= new Scanner(f);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		return arr;
		
	} 
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
	
}
	
	public void show() 
	  { 
		Node node = head;

		while (node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}

		System.out.println();
	  
	  }

	
	
}
