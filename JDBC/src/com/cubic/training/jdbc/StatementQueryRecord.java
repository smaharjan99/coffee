package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementQueryRecord {

	public static void main(String[] args) throws Exception {
		String select_sql="select person_id, first_name, last_name from person where Lower(first_name)"
	+"like Lower('Rocky%')";
		JDBCConnection con = new JDBCConnection();
		Connection JC = null;
		Statement stmt = null;
		
		try {
			JC=con.getConnection();
			System.out.println("success");
			stmt = JC.createStatement();
			ResultSet rs=stmt.executeQuery(select_sql);
			ResultSetMetaData rsmd=rs.getMetaData();
			while(rs.next()){
				System.out.println(rsmd.getColumnName(1)+" "+rs.getInt(1));
				System.out.println(rsmd.getColumnName(2)+" "+rs.getString(2));
				System.out.println(rsmd.getColumnName(3)+" "+rs.getString(3));
			}
			System.out.println("records selected");
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
