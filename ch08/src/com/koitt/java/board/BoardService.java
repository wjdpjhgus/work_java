package com.koitt.java.board;

public class BoardService {
	//필드선언
	private Integer count=0;
	private BoardDao dao;
	
	
	public BoardService() {
		this.dao=new BoardDao();
		this.count+=count;
	}
	
	
	public void add(Board b) {
		dao.insert(b);
	}
}
