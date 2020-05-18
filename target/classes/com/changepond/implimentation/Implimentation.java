package com.changepond.implimentation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.changepond.controller.Controller;
import com.changepond.dbconnection.DbConnection;
import com.changepond.pojo.Pojo;

public class Implimentation implements Controller{
	
	
	public void insert(String sl) throws SQLException {
		
		Pojo pojo= new Pojo();
		
//	java.sql.Connection connection1=DbConnection.conection();
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306/employe", "root", "darling");
		PreparedStatement preparedStatement= connection1.prepareStatement("insert into emp_tbl values(?,?,?)");
		preparedStatement.setInt(1, pojo.getEmpid());
		preparedStatement.setString(2, pojo.getEmpname());
		preparedStatement.setString(3, pojo.getEmprole());
		preparedStatement.executeUpdate();
		System.out.println("record is inserted");
		ResultSet executeQuery = preparedStatement.executeQuery("select * from emp_tbl");
		while(executeQuery.next()) {
			System.out.println(executeQuery.getString(1)+" "+executeQuery.getString(2)+" "
		+executeQuery.getString(3));
	}
		connection1.close();
		System.out.println("connection closed");

}
}
