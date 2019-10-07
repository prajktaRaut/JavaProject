package com.bridgelabz.datastructure;
class Nodee<T>
{
	T data;
	Nodee next=null;
}

public class Stack<T> {


	static Nodee head;
	
	char[] arr= new char[20];

	public void push(T data)
	{
		Nodee n= new Nodee();
		n.data=data;
		n.next=null;
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			Nodee node = head;
			
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=n;
			
		}
		
	}
	
	public T pop()
	{
		T ch = null;
		Nodee n=null;
		n= head.next;
		Nodee p=head;
		
		if(!isEmpty())
		{
		if(head.next==null)
		{
			ch=(T)head.data;
			head=null;
		}
		else
		{
			
			
		while(n.next!=null)
		{
			n=n.next;
			p=p.next;
		}
		//n=n.next;
		ch=(T)n.data;
		p.next=null;
		}
		}
		else
		{
			System.out.println("Stack is empty");
		}
		return ch;
	}
	
	public T peek()
	{
		T ch = null;
		
		Nodee n= head;
		
		while(n.next!=null)
		{
			n=n.next;
			ch=(T)n.data;	
		}
		
		return ch;
	}
	
	public static boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
