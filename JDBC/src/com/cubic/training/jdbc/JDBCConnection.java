package com.cubic.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection dbconnection=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		dbconnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","alkine99");
		return dbconnection;

	}

}
