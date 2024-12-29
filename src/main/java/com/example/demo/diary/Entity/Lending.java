package com.example.demo.diary.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Lending {

	@Id
	private long id;
	
	@ManyToMany
	private List<Book> book;
	
	@ManyToMany
	private List<Users> user;
	
	private String request;
	private String Status;
	private Date Issued_date;
	
	
	public Lending() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lending(long id, List<Book> book, List<Users> user, String request, String status, Date issued_date) {
		super();
		this.id = id;
		this.book = book;
		this.user = user;
		this.request = request;
		Status = status;
		Issued_date = issued_date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public List<Users> getUser() {
		return user;
	}
	public void setUser(List<Users> user) {
		this.user = user;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getIssued_date() {
		return Issued_date;
	}
	public void setIssued_date(Date issued_date) {
		Issued_date = issued_date;
	}
	
	
}
