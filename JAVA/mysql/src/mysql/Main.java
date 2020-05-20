package mysql;


import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;



public class Main {



	public static void main(String[] args) {

	    try {

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information_schema","root","1070");

		    Statement mystat=con.createStatement();

		    ResultSet myrs=mystat.executeQuery("Select * from Sample ");

		    while(myrs.next())

		    {

		    	System.out.println(myrs.getString("uname")+"  , "+myrs.getInt("serail")+"  , "+myrs.getDate("DOB"));
	    
		    }

		    
	    } catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}