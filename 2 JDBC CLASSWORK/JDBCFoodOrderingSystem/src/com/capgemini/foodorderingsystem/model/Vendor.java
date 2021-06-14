package com.capgemini.foodorderingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Vendor {
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
	
	public void createTableVendor() 
	{
		try {
			stmt=con.createStatement();
			String createTable="create table vendor(vId number,vName varchar2(20),vPwd varchar(10),vPhNo number,vAddr varchar(50));";
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
	

	int vId;
	long vPhNo;
	String vName,vAddr,vPwd;
	
	public void readProductDetails()
	{
		System.out.println("ENTER CUSTOMER DETAILS : ");
		System.out.print("Enter Vendor Name : ");
		vName=sc.nextLine();
		System.out.print("Enter Vendor Password : ");
		vPwd=sc.nextLine();
		System.out.print("Enter Vendor Phone number : ");
		vPhNo=sc.nextLong();
		System.out.print("Enter Vendor Address : ");
		sc.nextLine();
		vAddr=sc.nextLine();
	}
	int vIdInr=1;
	public int insertVendor()
	{
		try 
		{
			String insertData="insert into Vendor values(?,?,?,?,?)";
			pstmt=con.prepareStatement(insertData);
			readProductDetails();
			pstmt.setInt(1,vIdInr++);
			pstmt.setString(2,vName);
			pstmt.setString(3,vPwd);
			pstmt.setLong(4,vPhNo);
			pstmt.setString(5,vAddr);
			
			int i = pstmt.executeUpdate();
			if(i!=0) 
			{
				System.out.println("data inserted successfully");
				return vId;
			}
			else 
			{
				System.out.println("data is not inserted successfully");
				return 0;
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
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return 0;
	}

	public void getVendor(int vId2) {
		try 
		{
			String getProduct="Select * from Vendor where vId=?";
			pstmt=con.prepareStatement(getProduct);
			pstmt.setInt(1, vId2);
			rs=pstmt.executeQuery();
			//System.out.println("PID"+"\t"+"NAME"+"\t"+"PRICE");
			System.out.println("=======================================");
			while(rs.next())
			{
				//System.out.println(+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				System.out.println("Customer ID : "+rs.getInt(1));
				System.out.println("Customer Name : "+rs.getString(2));
				System.out.println("Customer Phone Number : "+rs.getLong(4));
				System.out.println("Customer Address : "+rs.getString(5));
				
			}
			System.out.println("=======================================");
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void updateVendor(int vId2) {
		try 
		{
			String updateProduct="update Vendor set vName=? where vId=?";
			pstmt=con.prepareStatement(updateProduct);
			pstmt.setInt(2,vId2);
			System.out.print("Enter Vendor Name : ");
			String pname=sc.nextLine();
			pstmt.setString(1, pname);
			
			int psu=pstmt.executeUpdate();
			if(psu!=0)
			{
				System.out.println("Customer details updated successfully");
			}
			else
			{
				System.out.println("Customer details not updated successfully");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void deleteVendor(int vId2) 
	{
	    try 
	    {
	        String deleteProduct = "delete from Vendor where vId = ?";
	        pstmt = con.prepareStatement(deleteProduct);
	        pstmt.setInt(1,vId2);
	        int i = pstmt.executeUpdate();
	        if(i != 0) {
	            System.out.println("product deleted successfully");
	        }else {
	            System.out.println("product not deleted  successfully");
	        }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }finally {
	            try {
	                pstmt.close();
	                //rs.close();
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }

	        }
	}
	
	public boolean loginValidate(int id,String pwd)
	{
		try 
		{
			String getProduct="Select vPwd from vendor where vId=?";
			pstmt=con.prepareStatement(getProduct);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			String pwdDB=null;
			while(rs.next())
			{
				pwdDB=rs.getString(1);
			}
			if(pwdDB.equals(pwd))
			{
				return true;
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return false;
	}
}
