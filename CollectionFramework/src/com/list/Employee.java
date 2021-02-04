package com.list;

public class Employee {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Employee(id ="+ id +",name =" + name +")" ;
	}

	}


