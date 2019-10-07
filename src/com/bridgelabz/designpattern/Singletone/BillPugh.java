package com.bridgelabz.designpattern.Singletone;

public class BillPugh {

	public static void main(String[] args) {
		
		BillPughSingletone object=BillPughSingletone.getInstance();
		
		System.out.println(object.hashCode());
		
		BillPughSingletone object1=BillPughSingletone.getInstance();
		
		System.out.println(object1.hashCode());

	}

}
