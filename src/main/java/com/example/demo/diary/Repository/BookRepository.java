package com.example.demo.diary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.diary.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	
}
