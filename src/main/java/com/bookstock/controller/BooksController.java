package com.bookstock.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstock.entity.Books;
import com.bookstock.model.to.BooksTO;
import com.bookstock.service.BooksService;

@RestController
@RequestMapping(value = "/books")
public class BooksController {
	@Autowired
	BooksService bookService;

	@RequestMapping(value = "/search/{name}")
	public List<BooksTO> getBooksByName(@PathVariable String name) {
		System.out.println("VARIABLE :" + name);
		return bookService.getBooksByName(name);
	}

	@RequestMapping(value = "/saveBook")
	public Books saveBook(@RequestBody BooksTO book) {
		return bookService.saveBook(book);
	}

	@RequestMapping(value = "/getAll")
	public List<Books> getAllBooks() {
		return bookService.getAllBooks();
	}

	@RequestMapping(value = "/delete")
	public String deleteWriter(@PathParam("writerId") int writerId) {
		return bookService.deleteWriter(writerId);
	}
}
