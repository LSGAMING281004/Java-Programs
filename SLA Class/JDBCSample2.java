package com.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSample2 {

	public static void main(String[] args) {

		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lcompany","root","lokesh281004");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from company1");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
