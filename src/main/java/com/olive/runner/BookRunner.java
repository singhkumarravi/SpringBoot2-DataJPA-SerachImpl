package com.olive.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.olive.model.Book;
import com.olive.repositiory.BookRepo;
@Component
public class BookRunner implements CommandLineRunner{
	@Autowired
	private BookRepo repo;
	
	
	public void run(String... args) throws Exception {
		;
		repo.saveAll(Arrays.asList(
				new Book(10, "Core Java", "HK", 300.0,"Programming"),
				new Book(20, "Adv Java", "Raghu", 500.0,"English"),
		        new Book(30, "Hibernate", "Natraj", 300.0,"Reading"),
		        new Book(40, "Spring FrameWork", "HK",800.0,"Programming"),
		        new Book(50, "Spring Boot", "HK", 900.0,"Science")));
		         System.out.println("All Record***********************");
		          repo.findAll().forEach(System.out::println);
		          Book b = new Book();
		          b.setId(10);
		          //b.setBookCost(300.0);
		      
		          //convert this into example object
		          Example<Book> example = Example.of(b);
		          //fetch data
		          List<Book> list = repo.findAll(example);
		          list.forEach(System.out::println);
		          System.out.println("DONE");
              }
	}


