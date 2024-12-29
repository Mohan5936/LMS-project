package com.example.demo.diary.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	@Id
	private Long id;
	
	@ManyToMany(mappedBy="user")
	private List<Lending> lending;
	
	private String uname;
	private String password;
	private String email;
	private long phn;
	
		
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhn() {
		return phn;
	}


	public void setPhn(long phn) {
		this.phn = phn;
	}


	

	public Users(Long id, String uname, String password, String email, long phn, List<Book> books) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phn = phn;
		
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", uname=" + uname + ", password=" + password + ", email=" + email + ", phn=" + phn
				+  "]";
	}


	public Users() {
		
	}
	
}
