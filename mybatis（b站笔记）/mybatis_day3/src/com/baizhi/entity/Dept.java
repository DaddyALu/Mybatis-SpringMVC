package com.baizhi.entity;

import java.util.List;

public class Dept {
	private String id;
	private String name;
	
	//关系属性
	private List<Emp> emps;
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
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
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}
	
}
