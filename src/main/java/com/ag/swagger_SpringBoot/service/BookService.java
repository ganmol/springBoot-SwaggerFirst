package com.ag.swagger_SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.swagger_SpringBoot.dao.BookRepository;
import com.ag.swagger_SpringBoot.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book.getBookId();
	}

	public Book getBook(int bookId) {
		return repository.findOne(bookId);
	}

	public List<Book> removeBook(int bookId) {
		repository.delete(bookId);
		return repository.findAll();
	}
}
