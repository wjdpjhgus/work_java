package com.koitt.java.board;

import java.util.Date;

public class Board {
	
	// 필드
	 private int id;			//게시물 번호
	 private String title;		//제목
	 private String content;	//내용
	 private String writer;		//작성자
	 private Date regDate;		//작성일
	
	 
	 
	 //생성자
	 public Board(int id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	 
	//getter & setter
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + id;
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	
	
	
	 
	 
}
