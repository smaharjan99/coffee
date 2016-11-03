package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCCreateTableDemo {

	public static void main(String[] args) throws Exception {
		String create_table="CREATE TABLE PERSON(PERSON_ID NUMBER(5) NOT NULL ENABLE," 
							+"FIRST_NAME VARCHAR2(30),"
							+ "LAST_NAME VARCHAR2(30))";
		//System.out.println(create_table);
		JDBCConnection con=new JDBCConnection();
		Connection JC=null;
		Statement stmt=null;
		try{
		JC=con.getConnection();
		System.out.println("success");
		stmt=JC.createStatement();
		stmt.execute(create_table);
		System.out.println("Table created");
		}finally{
			if(stmt!=null){
				stmt.close();
			}
			if(JC!=null){
				JC.close();
			}
		}
		
	}

}
