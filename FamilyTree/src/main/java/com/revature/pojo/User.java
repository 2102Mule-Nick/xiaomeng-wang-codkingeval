package com.revature.pojo;

public class User {
	
	private String username;
	private String fathername;
	private String mothername;
	private int id;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String fathername, String mothername) {
		super();
		this.username = username;
		this.fathername = fathername;
		this.mothername = mothername;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", fathername=" + fathername + ", mothername=" + mothername + "]";
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	
}
