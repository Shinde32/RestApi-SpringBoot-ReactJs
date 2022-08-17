package com.FirstSpringProject.RestApi.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FirstSpringProject.RestApi.BookData.Book;
import com.FirstSpringProject.RestApi.Services.BookServices;

//Request handle at Presentation Layer

@RestController
public class RequestController {
	
	@Autowired
	private BookServices bookService;

	//Get Book Data
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getBooks();
	}
	
//Get Book Data by Id
	@GetMapping("/books/{bId}")
	public Book getBook(@PathVariable String bId)
	{
		return this.bookService.getBook(Long.parseLong(bId));
	} 
	
//Add new Book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
		return this.bookService.addBook(book);
	}
//Update Book data
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book ubook)
	{
		return this.bookService.updateBook(ubook);
	}
//Delete Book
	
	@DeleteMapping("/books/{dId}")
	public Book deleteBook(@PathVariable String dId)
	{
		return this.bookService.deleteBook(Long.parseLong(dId));
	} 
}
