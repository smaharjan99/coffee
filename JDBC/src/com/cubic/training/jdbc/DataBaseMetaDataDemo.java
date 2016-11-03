package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;


public class DataBaseMetaDataDemo {

	public static void main(String[] args) throws Exception {
		JDBCConnection con = new JDBCConnection();
		Connection JC = null;
		
		
			try {
				JC=con.getConnection();
				DatabaseMetaData dbmd = JC.getMetaData();
				System.out.println("Driver name - "+dbmd.getDriverName());
				System.out.println("User name - "+dbmd.getUserName());
				System.out.println("Database Product name - "+dbmd.getDatabaseProductName());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if (JC!=null){
					JC.close();
				}
			}
			
	}
}
