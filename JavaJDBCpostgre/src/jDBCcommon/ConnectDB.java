package jDBCcommon;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public static void main(String[] args) {
		ConnectDB obj_ConnectDB= new ConnectDB();
		System.out.println(obj_ConnectDB.get_connection());
	}
		// TODO Auto-generated method stub
		public Connection get_connection(){
		Connection connection=null;
		try {
		     Class.forName("org.postgresql.Driver");
		     connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Maneesh@166");
		     if(connection!=null) {
		    	 System.out.println("connection is established");
		     }
		     else {
		    	 System.out.println("Connection failed");
		     }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return connection;
		

	}

}
