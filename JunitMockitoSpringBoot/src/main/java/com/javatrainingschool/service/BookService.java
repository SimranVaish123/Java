package com.javatrainingschool.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatrainingschool.entity.Book;
import com.javatrainingschool.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		List<Book> allBooks = (List<Book>) bookRepo.findAll();
		List<Book> author = (List<Book>) bookRepo.findAll();
		
		allBooks.forEach(b -> b.setName(b.getName()+"-b"));
		/* author.forEach(c -> c.setAuthor(c.getAuthor()+"-b")); */
		return allBooks;
	}
}
