package com.cubic.application.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConn {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection dbconn =null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		dbconn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","alkine99");
		return dbconn;
	}

}
