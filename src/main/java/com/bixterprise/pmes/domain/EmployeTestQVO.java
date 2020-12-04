package com.bixterprise.pmes.domain;


public class EmployeTestQVO {
	
	private String id;
	
	
	private String name;
	private String surname;
	private String function;

	public EmployeTestQVO(String id2) {
		this.id = id2;
	}
	public EmployeTestQVO() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	
	
}