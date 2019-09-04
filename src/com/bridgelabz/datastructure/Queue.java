package com.bridgelabz.datastructure;

public class Queue<T> {
	
	static Node head;
	Node front;
	Node rear;
	int size=0;
	
	
	public void enqueue(T data)
	{
		Node<T> n= new Node<>();
		
		n.data=data;
		n.next=null;
		
		if(isEmpty())
		{
			front=n;
			rear=n;
		}
		else
		{
			rear=n;
			rear=rear.next;
			
		}
	}
	
	public T dequeue()
	{
		T n= (T) front.data;
		
		if(front==null)
		{
			rear=null;
		}
		
		front= front.next;
		
		return n;
	}
	
	public boolean isEmpty()
	{
		return (front==null);
	}
	
	public void show()
	{
		Node n= front;
		
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println();
			
	}
	
}
	
