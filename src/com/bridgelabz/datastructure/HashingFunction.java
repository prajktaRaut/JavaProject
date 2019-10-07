package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HashingFunction {

	public static void main(String args[])
	{	
		OrderdListForHashing list[] = new OrderdListForHashing[11];
	 
	 
	 for(int i=0;i<=10;i++)
	 {
		 list[i]=new OrderdListForHashing();
	 }
	
	 int[]  number=OrderdListForHashing.readFile();
	 
	 String[] str=new String[number.length];
	 
	 for(int i=0;i<number.length;i++)
	 {
		 str[i]=Integer.toString(number[i]);
	 }
	 
	 int integerNumber,remainder=0;
	 
	 for(int i=0;i<str.length;i++)
	 {
		 integerNumber=Integer.parseInt(str[i]);
		 remainder=integerNumber%11;
		 list[remainder].append(integerNumber);
	 }
	 
	 for(int i=0;i<11;i++)
	 {
		 System.out.print(i+"--->");
		 list[i].show();
	 }
	 
	 System.out.println();
}
}
