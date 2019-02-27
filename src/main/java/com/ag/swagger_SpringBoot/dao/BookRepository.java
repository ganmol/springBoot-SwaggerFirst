package com.ag.swagger_SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ag.swagger_SpringBoot.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
