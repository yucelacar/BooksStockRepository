package com.bookstock.model.to;

public class BooksTO {
	private String bookName;
	private String writerName;
	private String categoryName;
	private String publisher;
	private String editionYear;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEditionYear() {
		return editionYear;
	}
	public void setEditionYear(String editionYear) {
		this.editionYear = editionYear;
	}
	
}
