package com.example.demo.diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.diary.Entity.Book;
import com.example.demo.diary.Repository.BookRepository;

@Service
public class BookService implements BookIMPL{

	@Autowired
	private BookRepository repo;
	
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	
	public Book updateBook(long id ) {
		       Book b=  getbyId(id);
		       b.setAuthor("Mahesh babu");
		       b.setGenre("Mass-Action");b.setAvailableCopies(5);b.setTotalCopies(10);
		       b.setIsbn("6774234");b.setTitle("Businessman");
		return repo.save(b);
	}

	public Book getbyId(@RequestBody Long id) {
		return repo.findById(id).orElse(null);
	}
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void deletebyId(@RequestBody Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public void deleteData( ) {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}
	




	
}
