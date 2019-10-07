package com.bridgelabz.designpattern.PrototypeDesignPattern;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		BookShop bookshop=new BookShop();
		
		bookshop.setShop_name("Novelty");
		
		bookshop.loadData();
		
		
		BookShop bookshop1=(BookShop) bookshop.clone();
		
		bookshop.getListOfBooks().remove(2);
		
		bookshop1.setShop_name("Vivekanand");
		
		// bookshop1.loadData();
		
		System.out.println(bookshop);
		
		System.out.println(bookshop1);
		
		
	}

}
