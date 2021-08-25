package com.olive.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
