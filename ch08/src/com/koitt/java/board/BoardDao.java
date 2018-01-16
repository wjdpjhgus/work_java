package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list; //DB대신에 사용자를 저장할 자료구조
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	public void insert(Board b) {
		
		this.list.add(b);
	}
	
}
