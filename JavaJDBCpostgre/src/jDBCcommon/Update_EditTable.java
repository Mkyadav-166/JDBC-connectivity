package jDBCcommon;

import java.sql.Connection;
import java.sql.Statement;

public class Update_EditTable {
	public static void main(String[] args) {
		Connection connection= null;
		Statement statement = null;
		ConnectDB obj_ConnectDB= new ConnectDB();
		connection=obj_ConnectDB.get_connection();
		try {
			String query="update employee set name='Mk' where s1_no='2'";
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
