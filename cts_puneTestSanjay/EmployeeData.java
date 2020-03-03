package com.cts.testmarch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeData {
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter name:");
		String name=br.readLine();
		System.out.println("Enter age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter address:");
		String address=br.readLine();
		System.out.println("Enter designation:");
		String desig=br.readLine();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		Connection conn = DriverManager.getConnection(url,"root","ROOT");
		String query="insert into user"+"(id,name,age,address,designation)"+" values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, address);
		ps.setString(5, desig);
		
		ps.executeUpdate();
		System.out.println("Data inserted successfully");
	}
}
