package com.bridgelabz.designpattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	String shop_name;
	List<Book> listOfBooks = new ArrayList<Book>();

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public void loadData()
	{		
		for(int i=1;i<=10;i++)
		{
			Book b= new Book();
			
			b.setBook_id(i);
			b.setBook_name("Book" + i);
			 
			getListOfBooks().add(b);
			
		}

	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		BookShop book= new BookShop();
		
		for (Book b : this.listOfBooks) {
			
			book.getListOfBooks().add(b);
			
		}
		
		
		return book;
	}
	
	@Override
	public String toString() {
		return "BookShop [shop_name=" + shop_name + ", listOfBooks=" + listOfBooks + "]";
	}

	
	
}
