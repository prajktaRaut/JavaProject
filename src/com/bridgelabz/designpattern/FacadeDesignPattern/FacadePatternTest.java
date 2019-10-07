package com.bridgelabz.designpattern.FacadeDesignPattern;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) {
		
		String tableName = "Employee";

		
		Connection con = MysqlHelper.getMysqlDBConnection();

		MysqlHelper sqlHelper = new MysqlHelper();

		sqlHelper.generateMysqlHTMLReport();

		
		
		Connection con1 = OracleHelper.getOracleDBConnection();

		OracleHelper oraclehelper = new OracleHelper();

		oraclehelper.genearteOraclePDFReport();
		
		
		FacadeHelper.generateReport(DBType.Mysql, ReportType.PDF, tableName);
		FacadeHelper.generateReport(DBType.Oracle, ReportType.HTML, tableName);
		
		
		
		

	}

}
