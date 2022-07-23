package com.FirstSpringProject.RestApi.Services;

import java.util.List;

import com.FirstSpringProject.RestApi.BookData.Book;

public interface BookServices {

		public List<Book> getBooks();

		public Book getBook(long bId);

		public Book addBook(Book book);

		public Book updateBook(Book ubook);

		public Book deleteBook(long dId);
		
}
