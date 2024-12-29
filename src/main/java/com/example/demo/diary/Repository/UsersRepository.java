package com.example.demo.diary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.diary.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	
}
