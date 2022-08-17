package com.FirstSpringProject.RestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FirstSpringProject.RestApi.BookData.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
