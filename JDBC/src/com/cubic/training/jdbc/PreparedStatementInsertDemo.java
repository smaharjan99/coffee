package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementInsertDemo {

	public static void main(String[] args) throws Exception {
		String insert_sql="insert into person values(s.nextval,?,?)";
		
		JDBCConnection con = new JDBCConnection();
		Connection JC = null;
		PreparedStatement pstmt = null;
		
		try {
			JC=con.getConnection();
			System.out.println("success");
			pstmt = JC.prepareStatement(insert_sql);
			for(int i=0; i<5; i++){
				pstmt.setString(1, "FirstName "+i);
				pstmt.setString(2, "LastName "+i);
				pstmt.executeUpdate();
			}
			System.out.println("records inserted");
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				pstmt.close();
			}
			if(JC!=null){
				JC.close();
			}
		}
	
	}

}
