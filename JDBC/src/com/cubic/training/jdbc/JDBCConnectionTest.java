package com.cubic.training.jdbc;

import java.sql.Connection;


public class JDBCConnectionTest {
	public static void main(String[] args) throws Exception {
		JDBCConnection con = new JDBCConnection();
		Connection JC=null;
		
		try {
			JC=con.getConnection();
			System.out.println("success");
		}finally{
				if (JC!=null){
					System.out.println("closing connection");	
					JC.close();
				}
		
		}
		
	}

}
