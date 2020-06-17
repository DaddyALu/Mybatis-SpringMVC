package com.baizhi.entity;

public class Card {
	private String id;
	private String code;
	private String address;
	private String fork;
	
	private User user;//关系属性
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFork() {
		return fork;
	}
	public void setFork(String fork) {
		this.fork = fork;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String id, String code, String address, String fork) {
		super();
		this.id = id;
		this.code = code;
		this.address = address;
		this.fork = fork;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", code=" + code + ", address=" + address
				+ ", fork=" + fork + "]";
	}
	
}
