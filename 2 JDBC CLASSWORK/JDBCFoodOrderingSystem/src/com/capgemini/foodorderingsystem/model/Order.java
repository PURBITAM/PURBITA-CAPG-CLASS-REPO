package com.capgemini.foodorderingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Order 
{
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	
	public Connection dbConnection() 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:PURBITAORACL","system","PURBITA1234");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void createTableOrderFood() 
	{
		try {
			stmt=con.createStatement();
			String createTable="create table orderfood(orderId number,ItemId number,orderDate varchar(20),orderCustId number)";
			int i=stmt.executeUpdate(createTable);
			if(i==0) 
			{
				System.out.println("Table Created Successfully");
			}
			else 
			{
				System.out.println("Table Not Created Successfully");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
