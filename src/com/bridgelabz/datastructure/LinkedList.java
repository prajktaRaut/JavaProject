package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import com.bridgelabz.utility.Utility;

public class LinkedList<T> {

	static Node head;
	
	
	public void append(T data)
	{
		Node node= new Node();
		 node.data=data;
		 node.next=null;
		 
		 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node n=head;
			 while(n.next!=null)
			 {
				 n=n.next;
			 }
			 n.next=node;
		 }
		
	}
	
	public void insertAtStart(T data)
	{
		Node<T> node= new Node<T>();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;
		
	}
	
	public void insert(T data,int index)
	{
		Node<T> node= new Node<T>();
		node.data=data;
		node.next=null;
		
		Node n=head;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			
			node.next=n.next;
			n.next=node;
				
		}

		
	}
	
	public void remove(int index)
	{
		
		Node<T> n =head;
		
		Node<T> n1=null;
		
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		
		n1=n.next;
		n.next=n1.next;
	}
	

	
		
	public void show()
	{
		Node<T> node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	
		System.out.println(node.data);
	
	}
	
	public static void writeOnFile()
	{
		Node n=head;
		
		String first=" ";
		
		while(n.next!=null)
		{
			first=first.trim()+" "+n.data.toString().trim();
			n=n.next;
		}
		first=first.trim()+" "+n.data.toString().trim();
		
		try(BufferedWriter writer= new BufferedWriter(new FileWriter("/home/user/Documents/doc.txt"))) 
		{
			
		writer.write(first);
		writer.close();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		
		return false;
	}
	
	
	public static int search(String[] s, String item)
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
	
	public static int size()
	{
		int counter=1;
		
		Node n= head;
		
		while(n.next!=null)
		{
			counter++;
			n=n.next;
		}
		
		return counter;
	}
	
	public int index(T item)
	{
		int pos=0;
		
		Node n= head;
		
		while(n.next!=null)
		{
			if(n.data.equals(item))
			{
				return pos;
	
			}
			else
			{
			n=n.next;
			pos++;
			}
			
			
		}
		
		return pos;
		
	}	
	
	public T pop()
	{
		T s = null;
		
		if(isEmpty())
		{
			System.out.println("List is empty");

		}
		else
		{
			int i=0;
		Node n= head;
	
		
		while(n.next!=null)
		{
			n=n.next;
			i++;
		}
		s=(T) n.data;
		
		remove(i);
		
		
	}
		
		return s;
		
	}
	
	public String pop(int index)
	{
		String s=" ";
		int count=0;
		
		Node n= head;
		
		for(int i=0;i<index;i++)
		{
			n=n.next;
			count++;
		}
		s=(String) n.data;
		
		remove(count);
		
		return s;
		
	}
}
