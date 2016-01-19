package com.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.books.Book;



@Controller
public class MyController {
	
	@RequestMapping("HI")
	public String myMethod(HttpServletRequest request){
		return("hello.jsp");
	}
	
	@RequestMapping("addBook")
	public ModelAndView addBook(HttpServletRequest request){
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		String bookName=request.getParameter("bookName");
		String bookAuth=request.getParameter("bookAuth");
		String bookPub=request.getParameter("bookPub");
		String email=request.getParameter("email");
		
		Book book=new Book();
		book.setBookAuth(bookAuth);
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setBookPub(bookPub);
		book.setEmail(email);
		//request.setAttribute("book", book);
		return new ModelAndView("showBook","book",book);
	}
	
}
