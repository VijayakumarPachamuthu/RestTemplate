package com.MyRestTemplate;



public class EmployeePojo {  //POJO Class don't have any annotation
	private int id;
	private String name;
	private int salary;
	private float experiance;
	private String gender;
	private String role;
	
	
	public EmployeePojo(int id, String name, int salary, float experiance, String gender, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experiance = experiance;
		this.gender = gender;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "EmployeeEnitiry [id=" + id + ", name=" + name + ", salary=" + salary + ", experiance=" + experiance
				+ ", gender=" + gender + ", role=" + role + "]";
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public float getExperiance() {
		return experiance;
	}
	public void setExperiance(float experiance) {
		this.experiance = experiance;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public EmployeePojo() {
		
	}

}
