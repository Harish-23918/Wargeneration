package com.changepond.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Repository;


@Repository
public class DaoConfigure {
	public static Connection getConnection() throws SQLException, ClassNotFoundException, NullPointerException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","darling");
		return con;
		
	}
}
