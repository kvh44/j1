package com.mkyong.model;

public class SimpleUser {
	private static Integer sequenceIncrement = 0; 
	private Integer id;
	private String username;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId() {
		this.id = ++sequenceIncrement;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return this.id +" "+ this.username +" "+ this.password;
	}
}
