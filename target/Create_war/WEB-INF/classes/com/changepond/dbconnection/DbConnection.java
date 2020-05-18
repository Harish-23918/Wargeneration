package com.changepond.dbconnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;


public class DbConnection {
	
	public static java.sql.Connection conection() throws SQLException {
		java.sql.Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employe", "root", "darling");
			return connection;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

}
