package com.bridgelabz.designpattern.FacadeDesignPattern;

import java.sql.Connection;

public class MysqlHelper {
	
	static Connection con=null;

	public static Connection getMysqlDBConnection()
	{
		return con;
	}
	
	public void generateMysqlPDFReport()
	{
		System.out.println("Mysql report in PDF format");
	
	}
	
	
	public void generateMysqlHTMLReport()
	{
		System.out.println("Mysql report in HTML format");
	}
	
}
