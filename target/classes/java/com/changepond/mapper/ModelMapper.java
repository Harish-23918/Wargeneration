package com.changepond.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.changepond.model.Model;

public class ModelMapper implements RowMapper<Model> {

	public Model mapRow(ResultSet rs, int rowNum) throws SQLException {
		Model md= new Model();
		md.setEmpid(rs.getInt("empid"));
		md.setEmpname(rs.getString("empname"));
		md.setEmprole(rs.getString("emprole"));
		
		
		return md;
	}

}
