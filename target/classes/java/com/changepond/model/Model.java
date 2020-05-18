package com.changepond.model;

public class Model {
	
	private int empid;
	private String empname;
	private String emprole;
	
	public Model(int empid,String empname,String emprole) {
	
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
	}
	
	public Model() {
		
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	@Override
	public String toString() {
		return "Model [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole + "]";
	}

}

