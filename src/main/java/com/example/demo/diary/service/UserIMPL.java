package com.example.demo.diary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.diary.Entity.Users;

@Service
public interface UserIMPL {

	public Users addUsers(Users user);
	public Users updateUser(Users user,Long id);
	public Users getById(Long id);
	public List<Users> getUsers();
	public void deletebyId(Long id);
	public void deleteData();
}
