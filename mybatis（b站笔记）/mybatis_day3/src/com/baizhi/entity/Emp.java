package com.baizhi.entity;

import java.util.Date;

public class Emp {
	private String id;
	private String name;
	private Integer age;
	private Double salary;
	private Date  bir;
	
	private Dept dept;//关系属性
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getBir() {
		return bir;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String id, String name, Integer age, Double salary, Date bir) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.bir = bir;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + ", bir=" + bir + "]";
	}
	
}
