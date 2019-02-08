package com.fdmgroup.bookunittesting.bookunittest;

import java.awt.print.Book;
import java.util.ArrayList;

public class Basket {
	
	private ArrayList<Book> basket = new ArrayList<>();
	
	public Basket() {
		
		// TODO Auto-generated constructor stub
			
	}

	public int getBooksInBasket() {
		// TODO Auto-generated method stub
		
		return basket.size();	 		
	}

	public void addBook(Book book) {
		basket.add(new Book());
		
	}






	

}
