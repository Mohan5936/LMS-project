package com.example.demo.diary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.diary.Entity.Book;
import com.example.demo.diary.Entity.Lending;
import com.example.demo.diary.Entity.Users;
import com.example.demo.diary.service.BookService;
import com.example.demo.diary.service.LendingService;
import com.example.demo.diary.service.UService;

@RestController
public class HomeController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private LendingService lendServe;
	
	@Autowired
	private UService users;
	
//Book Controller
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		
		return service.getBooks();
	}
	
	@PostMapping("/addbook")
	public Book add(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@PutMapping("/updateBook/{id}")
	public Book update(@PathVariable long id) {
		return service.updateBook(id);
	}

	@DeleteMapping("/deletebyId/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deletebyId(id);
	}

	@DeleteMapping("/deleteAll")
	public void deleteEntire() {
		service.deleteData();
	}
	
//UserController		
	@PostMapping("/adduser")
	public Users addUser(@RequestBody Users user) {
		return users.addUsers(user);
	}
	
	@GetMapping("/getusers")
	public List<Users> getUsers(){
		return users.getUsers();
	}
	
	@GetMapping("/get/{id}")
	public Users getUserbyId(@PathVariable Long id) {
		return users.getById(id);
	}
	
	@PutMapping("/updateuser/{id}")
	public Users updateUsers(Users user,@PathVariable Long id) {
		return users.updateUser(user,id);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deletebyId(@PathVariable Long id) {
		users.deletebyId(id);
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAll() {
		users.deleteData();
	}
	
	@GetMapping("/mohan")
	public String mohan() {
		return "Established";
	}
	
//LendingController
	@PostMapping("/addLending")
	public Lending addLend(@RequestBody Lending lend) {
		return lendServe.addLend(lend);
	}
	
	@GetMapping("/getAllLendings")
	public List<Lending> getAllLendings(){
		return lendServe.getAllLendings();
	}
	
	@PostMapping("/UpdateLending/{id}")
	public Lending updateLend(@PathVariable Long id,Lending lend) {
		return lendServe.updateLend(lend, id);
	}
	
	@DeleteMapping("/deleteAllLendings")
	public void deleteAllLendings() {
		lendServe.deleteData();
	}
	
	@DeleteMapping("/deleteByLendigId/{id}")
	public void deleteByLendId(@PathVariable Long id) {
		lendServe.deletebyId(id);
	}
	
	@GetMapping("/getByBookid/{id}")
	public List<Lending> getBybookid(@PathVariable Long id){
		return lendServe.getBybook_id(id);
	}
	
	@GetMapping("/getByUserid/{id}")
	public List<Lending> getByuserid(@PathVariable Long id){
		return lendServe.getByUser_id(id);
	}
}