package com.capgemini.foodorderingsystem.model;

import java.sql.Statement;
	import java.util.Scanner;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	
public class Customer 
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
		
		public void createTableCustomer() 
		{
			try {
				stmt=con.createStatement();
				String createTable="create table customer(custId number,custName varchar2(20),custPwd varchar(10),custPhNo number,custAddr varchar(50))";
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

		int custId;
		long custPhNo;
		String custName,custAddr,custPwd;
		
		public void readProductDetails()
		{
			System.out.println("ENTER CUSTOMER DETAILS : ");
			System.out.print("Enter Customer ID : ");
			custId=sc.nextInt();
			System.out.print("Enter Customer Name : ");
			sc.nextLine();
			custName=sc.nextLine();
			System.out.print("Enter Customer Password : ");
			custPwd=sc.nextLine();
			System.out.print("Enter Customer Phone number : ");
			custPhNo=sc.nextLong();
			System.out.print("Enter Customer Address : ");
			sc.nextLine();
			custAddr=sc.nextLine();
		}
		int custIdInr=1;
		public int insertCustomer()
		{
			try 
			{
				String insertData="insert into customer values(?,?,?,?,?)";
				pstmt=con.prepareStatement(insertData);
				readProductDetails();
				pstmt.setInt(1,custId);
				pstmt.setString(2,custName);
				pstmt.setString(3,custPwd);
				pstmt.setLong(4,custPhNo);
				pstmt.setString(5,custAddr);
				
				int i = pstmt.executeUpdate();
				if(i!=0) 
				{
					System.out.println("data inserted successfully");
					return custId;
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

		public void getCustomer(int custId2) {
			try 
			{
				String getProduct="Select * from customer where custId=?";
				pstmt=con.prepareStatement(getProduct);
				pstmt.setInt(1, custId2);
				rs=pstmt.executeQuery();
				System.out.println("PID"+"\t"+"NAME"+"\t"+"PRICE");
				System.out.println("=======================================");
				while(rs.next())
				{
					//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
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
		
		public void updateCustomer(int custId2) {
			try 
			{
				String updateProduct="update customer set custName=? where custId=?";
				pstmt=con.prepareStatement(updateProduct);
				pstmt.setInt(2,custId2);
				System.out.print("Enter Customer Name : ");
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
		
		public void deleteCustomer(int custId2) 
		{
		    try 
		    {
		        String deleteProduct = "delete from customer where custId = ?";
		        pstmt = con.prepareStatement(deleteProduct);
		        pstmt.setInt(1,custId2);
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
				String getProduct="Select custPwd from customer where custId=?";
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

		public void placeOrder(int custId2) 
		{
			
		}
}
