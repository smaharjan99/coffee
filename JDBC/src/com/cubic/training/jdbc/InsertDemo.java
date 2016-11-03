package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		//String create_sequence="create sequence s1 start with 100";
		String insert_sql="insert into person values (s.nextval,'Rocky','Balbao')";
		JDBCConnection con = new JDBCConnection();
		Connection JC = null;
		Statement stmt = null;
		
		try {
			JC=con.getConnection();
			System.out.println("success");
			//stmt.execute(create_sequence);
			//System.out.println("sequnce created");
			stmt = JC.createStatement();
			stmt.executeUpdate(insert_sql);
			System.out.println("record inserted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
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
