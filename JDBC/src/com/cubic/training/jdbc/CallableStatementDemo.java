package com.cubic.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) throws Exception {
		String INSERT_SQL="{call INSERTP(?,?,?)}";
		JDBCConnection con = new JDBCConnection();
		Connection JC = null;
		CallableStatement cstmt =null;
		
		try {
			JC=con.getConnection();
			System.out.println("success");
			cstmt=JC.prepareCall(INSERT_SQL);
			cstmt.setInt(1, 235);
			cstmt.setString(2, "Charles");
			cstmt.setString(3, "Darwin");
			cstmt.executeUpdate();
			System.out.println("record inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(cstmt!=null){
				cstmt.close();
			}
			if (JC!=null){
				JC.close();
			}
			
		}
		

	}

}
