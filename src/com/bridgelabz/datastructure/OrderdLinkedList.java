package com.bridgelabz.datastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


class NumberNode<T extends Comparable<T>>
{
	T data;
	NumberNode<T> next;

}

public class OrderdLinkedList<T extends Comparable<T>> {
	
	NumberNode<T> head;
	
	public void append(T data)
	{
		NumberNode<T> node= new NumberNode<>();
		 node.data=data;
		 node.next=null;
		 
		 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 NumberNode<T> current = head;
			 NumberNode<T> temp=null;
			 
			 while(current!=null && (current.data.compareTo(node.data))<0)
			 {
				 temp=current;
				 current=current.next;
			 }
			 node.next=current;
			 temp.next=node;
			
		 }
		
	}
	
	  public void insertAtStart(T data) 
	  {
		NumberNode node = new NumberNode();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;
	  
	  }
	  
	  public void insert(T data,int index) 
	  {
		NumberNode node = new NumberNode();
		node.data = data;
		node.next = null;

		NumberNode n = head;

		if (index == 0) {
			insertAtStart(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next; }
	  
			node.next=n.next; 
			n.next=node;
	  
	  }
		
	  }
	  
	  public void remove(int index) 
	  {
	  
	  NumberNode n =head;
	  
	  NumberNode n1=null;
	  
	  for(int i=0;i<index-1;i++) 
	  { 
		  n=n.next; 
		  
	  }
	  
	  n1=n.next; 
	  n.next=n1.next; 
	  
	  }
	  
	  
	  public void show() 
	  { 
		NumberNode node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}

		System.out.println(node.data);
	  
	  }
	  
	public void writeOnFile() {
		NumberNode<T> n = head;

		String first = " ";

		while (n.next != null) {
			first = first.trim() + " " + n.data.toString().trim();
			n = n.next;
		}
		first = first.trim() + " " + n.data.toString().trim();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Number.txt"))) {

			writer.write(first);
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	  
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}

	  return false; }
	  
	  
	
	public static int search(int[] s, int item) {

		int start = 0;
		int end = s.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;

			
			if (s[middle]==item) {
				return middle;
			}

			else if (item > s[middle]) {
				start = middle + 1;

			} else {
				end = middle - 1;

			}
		}
		return -1;
	}
	 
	public  int size() {
		int counter = 1;

		NumberNode<T> n = head;

		while (n.next != null) {
			counter++;
			n = n.next;
		}

		return counter;
	}

	public int index(String item) {
		int pos = 0;

		NumberNode<T> n = head;

		while (n.next != null) {
			if (n.data.equals(item)) {
				return pos;

			} else {
				n = n.next;
				pos++;
			}

		}
		pos--;
		return pos;

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
	catch (Exception e) {
		e.printStackTrace();
		return  null;
	}

	
	}

	public static int[] sort(int[] arr)
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
		
		return arr;
		
		
	}
	
}
