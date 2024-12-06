package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.services.BookService;

@RestController
public class BookController {

	/*
	 * @GetMapping("/books") public Book getBooks() { Book book=new Book();
	 * book.setId(1); book.setTitle("Java Complete Course"); book.setAuthor("XYZ");
	 * return book; }
	 */
	@Autowired
	private BookService bookService;

	/*
	 * //get all books handler
	 * 
	 * @GetMapping("/books") public List<Book> getBooks() {
	 * 
	 * return this.bookService.getAllBooks();
	 * 
	 * }
	 * 
	 * //get single book handler
	 * 
	 * @GetMapping("/books/{id}") public Book getBookById(@PathVariable("id") int
	 * id) { return this.bookService.getBookById(id); }
	 * 
	 * //add book handler
	 * 
	 * @PostMapping("/books") public Book addBook(@RequestBody Book book) { Book b =
	 * this.bookService.addBook(book); return b; }
	 * 
	 * //delete book handler
	 * 
	 * @DeleteMapping("/books/{bookId}") public void
	 * deleteBook(@PathVariable("bookId") int bookId) {
	 * this.bookService.deleteBook(bookId); }
	 * 
	 * //update book handler
	 * 
	 * @PutMapping("/books/{bookId}") public Book updateBook(@RequestBody Book
	 * book,@PathVariable("bookId") int bookId) {
	 * this.bookService.updateBook(book,bookId); return book; }
	 */

	/*---------------------------------------------------------------------------------------------*/
	/* Using ResponseEntity in all operations */

	// get all books handler
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {

		List<Book> list = this.bookService.getAllBooks();
		if (list.size() <= 0) {
			try {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ResponseEntity.of(Optional.of(list));
	}

	// get single book handler
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {
		Book b = this.bookService.getBookById(id);
		if (b == null) {
			try {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ResponseEntity.of(Optional.of(b));
	}

	// add book handler
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = this.bookService.addBook(book);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// delete book handler
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
		try {
			this.bookService.deleteBook(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// update book handler
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
		try {
			this.bookService.updateBook(book, bookId);
			return ResponseEntity.ok().body(book);
			
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
