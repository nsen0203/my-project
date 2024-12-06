package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Service
public class BookService {

	/*
	 * private static List<Book> list = new ArrayList<>();
	 * 
	 * static { list.add(new Book(1, "Java Complete Reference", "XYZ"));
	 * list.add(new Book(2, "Head First to Java", "ABC")); list.add(new Book(3,
	 * "Think in Java", "CDE")); }
	 * 
	 * // get All Books public List<Book> getAllBooks() { return list; }
	 * 
	 * // get single book by id public Book getBookById(int id) { for (Book b :
	 * list) { if (b.getId() == id) return b; } return null; }
	 * 
	 * // add book public Book addBook(Book book) { list.add(book); return book; }
	 * 
	 * // delete Book public void deleteBook(int bid) { for (Book b : list) { if
	 * (b.getId() == bid) try { list.remove(bid); } catch (Exception e) {
	 * e.printStackTrace(); } } }
	 * 
	 * // update Book public void updateBook(Book book, int bookId) { for (Book b :
	 * list) { if (b.getId() == bookId) { b.setTitle(book.getTitle());
	 * b.setAuthor(book.getAuthor()); } } }
	 */

	/*-----------------------------------------------------------------------------------*/
	/* Using Mysql and JPA */

	@Autowired
	private BookRepository bookRepository;

	// get All Books
	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	// get single book by id
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	// add book
	public Book addBook(Book book) {
		Book result = this.bookRepository.save(book);
		return result;
	}
	
	// delete Book 
	public void deleteBook(int bid) {
		this.bookRepository.deleteById(bid);
	}
	
	// update Book 
	public void updateBook(Book book, int bookId) {
		book.setId(bookId);
		this.bookRepository.save(book);
	}
}
