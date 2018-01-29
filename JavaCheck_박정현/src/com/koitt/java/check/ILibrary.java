package com.koitt.java.check;

import java.util.ArrayList;

public interface ILibrary {

	//book 정보추가 : isbn 값이 같으면 정보 추가 안됨
	public boolean addBook(Book book);
	
	//book 정보 삭제
	public boolean delBook(String isbn);
	
	//ArratList에 저장된 book 전체 정보를 배열로 리턴
	public ArrayList<Book> allBooks();
	
	//ArratList에  저장된 전체 정보를 Console에 출력
	public void showAll();

	//ArratList에  저장된 book 정보를 Console에 출력
	public void showAllbooks();
	
	//ArratList에  정장된 Magazine 정보를 Console에 출력
	public void showAllMagazinws();
	
	//해당 type의 서적 개수 리턴
	public int size(String type);

	//해당 제목의 book정보리턴
	public Book getBook(String title);
}
