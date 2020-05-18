package com.changepond.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.changepond.dao.DaoClass;
import com.changepond.model.Model;

@Service
public class ServiceClass {
	@Autowired
	private DaoClass class1;
//	public Model getEmploye(final int empid) {
//		return class1.getEmploye(empid);
//	}
	public List<Model> getEmploye() {
		return class1.getEmploye();
	}
//	public void addEmploye(Model md) {
//		class1.addEmploye(md);
//	}
}	