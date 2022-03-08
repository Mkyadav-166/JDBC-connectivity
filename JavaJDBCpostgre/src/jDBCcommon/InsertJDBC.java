package jDBCcommon;
import java.sql.*;
public class InsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection= null;
		Statement statement = null;
		ConnectDB obj_ConnectDB= new ConnectDB();
		connection=obj_ConnectDB.get_connection();
		System.out.println(obj_ConnectDB.get_connection());
		
		try {
			String query="insert into employee (name,address) values ('Mohit Kumar','Bharma colony')";
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Values are updated succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
