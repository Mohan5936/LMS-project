package com.example.demo.diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.diary.Entity.Lending;
import com.example.demo.diary.Repository.LendingRepository;

@Service
public class LendingService implements LendingIMPL {

	@Autowired
	private LendingRepository lend;
	

	public Lending addLend(Lending led) {

		return lend.save(led);
	}

	@Override
	public Lending updateLend(Lending led, Long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Lending getById(Long id) {
		// TODO Auto-generated method stub
		return lend.findById(id).orElseThrow();
	}

	@Override
	public List<Lending> getAllLendings() {
		// TODO Auto-generated method stub
		return lend.findAll();
	}

	@Override
	public void deletebyId(Long id) {
		// TODO Auto-generated method stub
		lend.deleteById(id);
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		lend.deleteAll();
	}
	
	public List<Lending> getBybook_id(Long id){
		return lend.getByBook_id(id);
	}
	


	@Override
	public List<Lending> getByUser_id(Long id) {
		// TODO Auto-generated method stub
		return lend.getByUser_id(id);
	}
}
