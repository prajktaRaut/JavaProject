package com.bridgelabz.designpattern.FacadeDesignPattern;

import java.sql.Connection;

public class OracleHelper {

	static Connection con=null;
	
	
	public static Connection getOracleDBConnection()
	{
		return con;
	}
	
	public void genearteOraclePDFReport()
	{
		System.out.println("Oracle report in PDF format");
	}
	
	public void generateOracleHTMLReport()
	{
		System.out.println("Oracle report in HTML format");
	}
	
	
}
