package com.FirstSpringProject.RestApi.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FirstSpringProject.RestApi.BookData.Book;
import com.FirstSpringProject.RestApi.Dao.BookDao;

//Request handling at Service Layer

@Service
public class BookServicesImp implements BookServices {

	@Autowired
	private BookDao bookDao;
	
	//List<Book> list;
	
	public BookServicesImp()
	{
		/*
		list = new ArrayList<>();
		list.add(new Book(1,"Indian Polity and Constitution","M.Laxmikant","Indian Polity"));
		list.add(new Book(2,"Modern Indian History","Rajiv Ahir","History"));
		list.add(new Book(3,"ShankarIas","ShankarIas Institute","Environment"));
		list.add(new Book(4,"Indian Economy","Sanjiv Varma","Economy"));
		*/
	}
	
	@Override
	public List<Book> getBooks() {
		
		return bookDao.findAll();
	}

	@Override
	public Book getBook(long bId) {
		/*
		Book b = null;
		for(Book bt:list)
		{
			if(bt.getB_Id() == bId)
			{
				b = bt;
				break;
			}
		}
		*/
		return bookDao.getReferenceById(bId);
	}

	@Override
	public Book addBook(Book book) {
		
	//	list.add(book);
		bookDao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book ubook) {
	
		/*
		list.forEach(b -> {
			if(b.getB_Id() == ubook.getB_Id())
			{
				b.setB_Name(ubook.getB_Name());
				b.setB_Author(ubook.getB_Author());
				b.setB_Subject(ubook.getB_Subject());
			}
		});
		*/
		bookDao.save(ubook);
		return ubook;
	}

	@Override
	public Book deleteBook(long dId) {

		/*
		Book b = null;
		for(Book bt:list)
		{
			if(bt.getB_Id() == dId)
			{
				b = bt;
				break;
			}
		}
		list.remove(b);
		*/
		Book entity = bookDao.getReferenceById(dId);
		bookDao.delete(entity);
		return entity;
	}
	
}
