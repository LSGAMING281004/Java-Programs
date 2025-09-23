package com.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// This is create a table code JDBC
public class JDBCSample1 {

	static final String DB_URL="jdbc:mysql://localhost:3306/JDBCSample1";
	static final String USER="root";
	static final String PASS="lokesh281004";
	
	public static void main(String[] args) {
		try(Connection conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn1.createStatement();
				){
			String sql = "create table Registration("+
				"id int primary key not null,"+
					" firstname varchar(23),"+
					"lastname varchar(23),"+"age int not null"+");";
			stmt.executeUpdate(sql);
			System.out.println("Create a table under a given DB");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
