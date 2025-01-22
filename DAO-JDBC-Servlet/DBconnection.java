package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static String url="jdbc:mysql://localhost:3306/employee";
	public static String u_name="root";
	public static String pass="";
	public static Connection getconnection()throws ClassNotFoundException,SQLException{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,u_name,pass);
		return con;
	}

}
