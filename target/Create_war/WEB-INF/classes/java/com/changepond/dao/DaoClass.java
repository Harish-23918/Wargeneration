package com.changepond.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.changepond.mapper.ModelMapper;

import com.changepond.model.Model;

@Repository
@Transactional
public class DaoClass {
	@Autowired
	private JdbcTemplate jdbcTemplate;
//	public Model getEmploye(final int empid) {
//		Model md = jdbcTemplate.queryForObject("select * from employe where empid = ?", new Object[] { empid },
//				new ModelMapping());
//		return md;
//	}
	public List<Model> getEmploye() {
		List<Model> mc = jdbcTemplate.query("select * from employe", new ModelMapper());
		Model md= new Model();
//		jdbcTemplate.update("insert into employe(empid,empname, emprole) values(?, ?,?)",
//				new Object[] { md.getEmpid(), md.getEmpname(), md.getEmprole() });
//		return mc;
		return mc;
	}
	public void addEmploye(Model md) {
		jdbcTemplate.update("insert into employe(empid,empname, emprole) values(?, ?,?)",
				new Object[] { md.getEmpid(), md.getEmpname(), md.getEmprole() });
	}
}