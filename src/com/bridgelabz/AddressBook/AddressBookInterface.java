package com.bridgelabz.oops.AddressBook;

public interface AddressBookInterface {

	public void add(String firstName,String lastName, long phoneNumber,String city,String state,double zip);
	public void edit();
	public void delete();
	public void sortbyname();
	public void sortbyzip();
	
	
	
}
