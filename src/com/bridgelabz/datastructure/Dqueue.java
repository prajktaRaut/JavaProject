package com.bridgelabz.datastructure;

public class Dqueue {

	static char[] queue=new char[10];
	static int front;
	static int rear;
	static int size;
	
	public static void addFront(char ch)
	{
		if(rear==queue.length)
		{
			System.out.println("overflow");
		}
		else
		{
			for(int i=rear; i>front;i--)
			{
				queue[i]=queue[i-1];
			}
			queue[front]=ch;
			rear= rear+1;
				
		}
		
	}
	
	public static void addRear(char ch)
	{
		if(rear==queue.length)
		{
			System.out.println("overflow");
		}
		else
		{
			queue[rear]=ch;
			rear=rear+1;
		}
	}
	

	public static char deleteFront()
	{
		char ch=0;
		
		if(rear==front)
		{
			System.out.println("underflow");
		}
		else
		{
			ch=queue[front];
			queue[front]=0;
			front=front+1;
		}
		
		return ch;
	}
	
	public static char deleteRear()
	{
		char ch=0;
		
		if(rear==front)
		{
			System.out.println("underflow");
		}
		else
		{
			rear=rear-1;
			ch=queue[rear];
			queue[rear]=0;
		}
		
		return ch;
	}
	
	public static void show()
	{
		for(int i=0;i<rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
}
