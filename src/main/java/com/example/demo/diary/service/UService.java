package com.example.demo.diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.diary.Entity.Users;
import com.example.demo.diary.Repository.UsersRepository;

@Service
public class UService implements UserIMPL {

	@Autowired
	private UsersRepository urepo;
	
	@Override
	public Users addUsers(Users user) {
		// TODO Auto-generated method stub
		return urepo.save(user);
	}

	@Override
	public Users updateUser(Users user,Long id) {
		// TODO Auto-generated method stub
		Users usr=getById(id);
		long phn=79359556;
		usr.setUname("ROhit");
		usr.setPassword("Rphit@123");
		usr.setEmail("rohit@gmail.com");
		usr.setPhn(phn);
		return urepo.save(usr);
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}


	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		urepo.deleteAll();
	}

	@Override
	public Users getById(Long id) {
		// TODO Auto-generated method stub
		return urepo.findById(id).orElse(null);
	}

	@Override
	public void deletebyId(Long id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
	}

}
