package jDBCcommon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadingJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection= null;
		Statement statement = null;
		ResultSet set=null;
		ConnectDB obj_ConnectDB= new ConnectDB();
		connection=obj_ConnectDB.get_connection();
		System.out.println(obj_ConnectDB.get_connection());
		
		try {
			String query="select * from employee";
			statement=connection.createStatement();
			set=statement.executeQuery(query);
			while(set.next()) {
				System.out.print(set.getString(1)+" ");
				System.out.print(set.getString(2)+" ");
				System.out.println(set.getString(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
