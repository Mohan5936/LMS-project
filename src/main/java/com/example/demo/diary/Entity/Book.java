package com.example.demo.diary.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToMany(mappedBy="book")
	private List<Lending> lending=new ArrayList<>();
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private int availableCopies;
    private int totalCopies;
    
   
    
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", isbn=" + isbn
				+ ", availableCopies=" + availableCopies + ", totalCopies=" + totalCopies +  "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}



	
	public Book(Long id, String title, String author, String genre, String isbn, int availableCopies, int totalCopies) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
		this.totalCopies = totalCopies;
		
	}

	public Book() {
    	 
     }
}
