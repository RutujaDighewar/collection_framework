package com.app.sorting;

public class Employee implements Comparable {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	/*public int compareTo(Object o) {
		Employee emp=(Employee) o;
		if(emp.getAge()==this.age)
			return 0;                                    //age
		else if(emp.getAge() < this.age)
			return 1;
		else 
			return -1;*/
		
	
		
	/*public int compareTo(Object o) {
		Employee emp=(Employee) o;
		if(emp.getId() == this.id)
			return 0;                                   //id
		else if(emp.getId() < this.id)
			return 1;
		else 
			return -1;
		
	}*/
	
	public int compareTo(Object o) {
		Employee em=(Employee) o;                           //name
		//return this.name.compareTo(em.getName());
		return em.getName().compareTo(this.name);
	}
	
	
	
}