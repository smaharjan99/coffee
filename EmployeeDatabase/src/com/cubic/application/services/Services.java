package com.cubic.application.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import com.cubic.application.ui.MainUI;

public class Services {

	public static void main(String[] args) throws Exception {
		int id, age, salary;
		String name, address, gender, department;

		Scanner input = new Scanner(System.in);

		// void add() {

		// }
		Services serv = new Services();
		MainUI main = new MainUI();

		String addEmp = "insert into employeedatabase" + "values(?,?,?,?,?,?,?)";
		String updateEmp = "update employeedatabase where id=?";
		String deleteEmp = "delete employeedatabase where id=?";
		String displayEmp = "select * from employeedatabase";
		JDBConn connect = new JDBConn();
		Connection OC = null;
		PreparedStatement stmt = null;
		Statement cstmt = null;
		// ResultSet rs = null;

		try {
			OC = connect.getConnection();
			System.out.println("success");

			stmt = OC.prepareStatement(addEmp);
			stmt = OC.prepareStatement(updateEmp);
			// stmt = OC.prepareStatement(deleteEmp);
			cstmt = OC.createStatement();
			ResultSet rs = cstmt.executeQuery(displayEmp);
			ResultSetMetaData rsmd = rs.getMetaData();

			while (main.editNum != 8) {
				main.menu();
				switch (main.choice) {
				case 1:
					// main.add();
					System.out.println("Enter id - ");
					id = input.nextInt();

					System.out.print("Enter Name - ");
					name = input.next();

					System.out.print("Enter gender - ");
					gender = input.next();
					System.out.println("Enter age - ");
					age = input.nextInt();
					System.out.print("Enter address- ");
					address = input.next();

					System.out.print("Enter salary - ");
					salary = input.nextInt();

					System.out.print("Enter department - ");
					department = input.next();

					stmt.setInt(1, id);
					stmt.setString(2, name);
					stmt.setString(3, gender);
					stmt.setInt(4, age);
					stmt.setString(5, address);
					stmt.setInt(6, salary);
					stmt.setString(7, department);

					stmt.executeUpdate(addEmp);

					System.out.println("records inserted");
					break;
				case 2:
					main.update();
					stmt.setInt(1, main.id);
					stmt.executeUpdate(updateEmp);
					break;
				case 3:
					main.delete();
					stmt.setInt(1, main.id);
					cstmt.executeQuery(deleteEmp);
					break;
				case 4:
					main.search();
					break;
				case 5:
					main.display();
					System.out.print(rsmd.getColumnName(1) + " ");
					System.out.print(rsmd.getColumnName(2) + " ");
					System.out.print(rsmd.getColumnName(3) + " ");
					System.out.print(rsmd.getColumnName(4) + " ");
					System.out.print(rsmd.getColumnName(5) + " ");
					System.out.print(rsmd.getColumnName(6) + " ");
					System.out.println(rsmd.getColumnName(7) + " ");

					while (rs.next()) {
						System.out.print(rs.getInt(1) + " ");
						System.out.print(rs.getString(2) + " ");
						System.out.print(rs.getString(3) + " ");
						System.out.print(rs.getInt(4) + " ");
						System.out.print(rs.getString(5) + " ");
						System.out.print(rs.getInt(6) + " ");
						System.out.println(rs.getString(7) + " ");

					}
					break;
				case 6:
					System.out.println("Exit the Program");
					System.exit(0);
					break;
				}
			}

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (OC != null) {
				System.out.println("Closing Connection");
				OC.close();
			}
		}

	}
}
