package com.example.demo.diary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.diary.Entity.Lending;
import com.example.demo.diary.Entity.Users;



@Service
public interface LendingIMPL {

	public Lending addLend(Lending led);
	public Lending updateLend(Lending led,Long id);
	public Lending getById(Long id);
	public List<Lending> getAllLendings();
	public void deletebyId(Long id);
	public void deleteData();
	
	public List<Lending> getBybook_id(Long id);
	public List<Lending> getByUser_id(Long id);
}
