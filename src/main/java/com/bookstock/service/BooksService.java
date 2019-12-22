package com.bookstock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstock.entity.Books;
import com.bookstock.entity.Writers;
import com.bookstock.model.to.BooksTO;
import com.bookstock.repository.BooksRepository;
import com.bookstock.repository.WritersRepository;

@Service
public class BooksService {
	@Autowired // springin static klasslarini cagirmak icin kullanilir.
	BooksRepository booksRepository;

	@Autowired // springin static klasslarini cagirmak icin kullanilir.
	WritersRepository writersRepository;

	public Books saveBook(BooksTO book) {
		Books _bookEntity = new Books();
		Writers writer = writersRepository.getWriterByName(book.getWriterName());
		_bookEntity.setBookName(book.getBookName());
		_bookEntity.setCategoryName(book.getCategoryName());
		_bookEntity.setEditionYear(book.getEditionYear());
		_bookEntity.setPublisher(book.getPublisher());
		if (writer != null) {
			_bookEntity.setWriterId(writer.getId());
		} else {
			writer =  new Writers();
			writer.setName(book.getWriterName());
			writer = writersRepository.save(writer);
			_bookEntity.setWriterId(writer.getId());
		}
		return booksRepository.save(_bookEntity);		
	}
	public List<BooksTO> getBooksByName(String name){
		List<Books> _books= booksRepository.getBooksByName(name);
		List<BooksTO> _booksListTO = new ArrayList<BooksTO>();
		for (Books books : _books) {
			BooksTO bookTO= new BooksTO();
			bookTO.setBookName(books.getBookName());
			bookTO.setCategoryName(books.getCategoryName());
			bookTO.setEditionYear(books.getEditionYear());
			bookTO.setPublisher(books.getPublisher());
			bookTO.setWriterName(writersRepository.getOne(books.getWriterId()).getName());
			_booksListTO.add(bookTO);
		}
		return _booksListTO;
	}
	
	public String deleteWriter(int writerId) {
		int deleteWriterResult = writersRepository.deleteWriterById(writerId);
		int deleteBooksResult = 0;
		if(deleteWriterResult > 0) {
			deleteBooksResult = booksRepository.deleteBooksByWriter(writerId);
		}
		if(deleteBooksResult > 0) {
			return "{\"result\" : \"SUCCESS\"}";
		} else {
			return "{\"result\" : \"ERROR\"}";
		}
	}
	public List<Books> getAllBooks(){
		return booksRepository.findAll();
	}
}
