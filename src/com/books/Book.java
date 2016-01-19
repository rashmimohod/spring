package com.books;

public class Book {
	private String bookName, bookAuth,bookPub,email;
	private int bookId;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	public String getBookPub() {
		return bookPub;
	}
	public void setBookPub(String bookPub) {
		this.bookPub = bookPub;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuth=" + bookAuth
				+ ", bookPub=" + bookPub + ", email=" + email + ", bookId="
				+ bookId + "]";
	}
	public Book(String bookName, String bookAuth, String bookPub, String email,
			int bookId) {
		super();
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookPub = bookPub;
		this.email = email;
		this.bookId = bookId;
	}
	public Book() {
		super();
		this.bookName = "John";
		this.bookAuth = "Learn Spring";
		this.bookPub = "ABC pub";
		this.email = "abc@email.com";
		this.bookId = 101;
	}
	

}
