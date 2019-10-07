package com.bridgelabz.designpattern.FacadeDesignPattern;

import java.sql.Connection;

public class FacadeHelper {

	
	public static void generateReport(DBType dbtype,ReportType reportType, String tableName)
	{
		
		Connection con= null;
		
		switch (dbtype) {
		
		case Mysql:
			
			con=MysqlHelper.getMysqlDBConnection();
			
			MysqlHelper sqlHelper= new MysqlHelper();
			
			switch (reportType) {
			case PDF:
				
				sqlHelper.generateMysqlPDFReport();
				
				break;

			case HTML:
				
				sqlHelper.generateMysqlHTMLReport();
				
				break;
				
				
			default:
				break;
			}
	
			break;

		case Oracle:
			
			con= OracleHelper.getOracleDBConnection();
			
			OracleHelper oraclehelper=new OracleHelper();
			
			switch (reportType) {
			case PDF:
				
				oraclehelper.genearteOraclePDFReport();
				
				break;

			case HTML:
				
				oraclehelper.generateOracleHTMLReport();
				
				
				break;
				
			default:
				System.out.println("enter proper input");
				break;
			}
			
			
			break;
			
			
		default:
			System.out.println("enter proper input");
			
			break;
		}
		
		
		
	}
	
}


