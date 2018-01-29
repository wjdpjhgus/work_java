package com.koitt.java.check;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement implements ILibrary {

	
	private ArrayList<Book> list;
	private ArrayList<Magazine> list2;
	
	public LibraryManagement() {
				this.list = new ArrayList<Book>();
				this.list2= new ArrayList<Magazine>();
				
			}
	
	@Override
	public boolean addBook(Book book) {
 		list.add(book);
 		
 	}
	

	@Override
	public boolean delBook(String isbn) {
		for (int i = 0; i < this.list.size(); i++) {
 			if (this.list.get(i).equals(delBook(isbn))) {
 				this.list.remove(this.list.get(i));	
 			}
		}
	}
	
	
	@Override
	public ArrayList<Book> allBooks() {
		
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		return this.list;
	}

	@Override
	public void showAllbooks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllMagazinws() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book getBook(String title) {
		// TODO Auto-generated method stub
		return null;
	}


