package com.changepond.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.changepond.implimentation.Implimentation;
import com.changepond.pojo.Pojo;

public class ServiceController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		resp.getContentType();
		PrintWriter writer = resp.getWriter();
		int empid=Integer.parseInt(req.getParameter("emp_id"));
		
		String empname=req.getParameter("emp_name");
		String emprole=req.getParameter("emp_role");
		
		Pojo pojo= new Pojo();
		pojo.setEmpid(empid);
		pojo.setEmpname(empname);
		pojo.setEmprole(emprole);
		 String searchTerm = req.get
		   
		Implimentation implimentation= new Implimentation();
		 
		try {
			implimentation.insert(searchTerm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
////				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//				Class.forName("com.mysql.jdbc.Driver");
//
//			System.out.println("driver rigistered sucessfully");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe", "root", "darling");
//			System.out.println("connection established");
//			PreparedStatement preparedStatement= connection.prepareStatement("insert into emp_tbl values(?,?,?)");
//			preparedStatement.setInt(1, pojo.getEmpid());
//			preparedStatement.setString(2, pojo.getEmpname());
//			preparedStatement.setString(3, pojo.getEmprole());
//			preparedStatement.executeUpdate();
//			System.out.println("record is inserted");
//			ResultSet executeQuery = preparedStatement.executeQuery("select * from emp_tbl");
//			while(executeQuery.next()) {
//				writer.println(executeQuery.getString(1)+" "+executeQuery.getString(2)+" "
//			+executeQuery.getString(3));
//			}
//			connection.close();
//			System.out.println("connection closed");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
//	writer.print(pojo.getEmpid()+":"+pojo.getEmpname()+":"+pojo.getEmprole());
//	writer.print("<html>"+"<h1>"+"hello"+"</h1>"+"</html>");
	}
}
	
//	}

//}
