package com.changepond.service;


import org.springframework.stereotype.Service;
import com.changepond.dao.DaoConfigure;
import com.changepond.model.Model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;


@Service
public class ServiceImpl implements ServiceConfigure {
	
	
	  
	
	public int insert(Model md) throws IOException
	{
		int flag=0;
		String sql="insert into employe values(?,?,?)";
		try
		{
			Connection con=DaoConfigure.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, md.getEmpid());
			ps.setString(2, md.getEmpname());
			ps.setString(3, md.getEmprole());
			flag=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return flag;
		
	}
	

}
