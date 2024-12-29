package com.example.demo.diary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.diary.Entity.Book;

@Service
public interface BookIMPL {

	public Book addBook(Book book);
	public Book updateBook(long id);
	public Book getbyId(Long id);
	public List<Book> getBooks();
	public void deletebyId(Long id);
	public void deleteData();
}
