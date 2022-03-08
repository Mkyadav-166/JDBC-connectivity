package jDBCcommon;

import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;

public class Create_Table {

	public static void main(String[] args) {
	
		Connection connection=null;
		Statement statement=null;
		ConnectDB obj_ConnectDB= new ConnectDB();
		connection=obj_ConnectDB.get_connection();
		
		try {
			String query="create table employee(s1_no SERIAL primary key,name varchar(200),address varchar(200))";
			statement=connection.createStatement();
			statement.executeUpdate(query);
		System.out.println("Finished message");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
//package jDBCcommon;
//import java.sql.*;
//public class InsertJDBC {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Connection connection=null;
//		try {
//			 Class.forName("org.postgresql.Driver");
//		     connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Maneesh@166");
//		     //create a query
//		     String q="create table table1(tId int primary key , tName varchar(200) not null, tCity varchar(200))";
//		     //create a statement
//		     Statement stmt=connection.createStatement();
//		     stmt.executeUpdate(q);
//		     
//		     System.out.println("Table created in database");
//		     connection.close();
//	}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
