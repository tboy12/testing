package com.fdmgroup.bookunittesting.bookunittest;

import static org.junit.Assert.*;

import java.awt.print.Book;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	
	private Basket basket;
	private Book book;
	
	@Before
	public void init(){
		basket = new Basket();
		book = new Book();
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		int espected_number_of_books = 0;
		
		assertEquals(espected_number_of_books, basket.getBooksInBasket());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		int espected_number_of_books = 1;
		basket.addBook(book);

		//basket.getBooksInBasket(book);
		assertEquals(espected_number_of_books, basket.getBooksInBasket());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks(){
		int expectedResult = 2; 
		
		basket.addBook(book);
		basket.addBook(book);
		assertEquals(expectedResult, basket.getBooksInBasket());
	}


}
