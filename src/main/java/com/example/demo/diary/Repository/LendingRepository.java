package com.example.demo.diary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.diary.Entity.Book;
import com.example.demo.diary.Entity.Lending;

public interface LendingRepository extends JpaRepository<Lending, Long> {


	public List<Lending> getByBook_id(Long id);
	public List<Lending> getByUser_id(Long id);
}
