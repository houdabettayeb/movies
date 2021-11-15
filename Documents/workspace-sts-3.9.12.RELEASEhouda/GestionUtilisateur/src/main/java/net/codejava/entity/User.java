package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;
	private String firstName;
	private String lasttName;
	private String email;
	private String username;
	private String password;
	private String role;
	//enum
	
	
	
	
	
	
	public User() {
		super();
	}
	
	public User(String firstName, String lasttName, String email, String username, String password, String role) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	

	public int getUserId() {
		return UserId;
	}
	
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	
	
	
	
	
	
	

}
