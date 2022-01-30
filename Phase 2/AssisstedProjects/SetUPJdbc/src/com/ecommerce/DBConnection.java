package com.ecommerce;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn() throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Chandu@3");
	   	 return con;
	    }

	private Object connection;
	public Connection getConnection(){
        return this.getConnection();
}

public void closeConnection() throws SQLException {
        if (this.connection != null)
                ((Connection) this.connection).close();
}

}
