package com.koitt.java.board;

import java.util.Date;


//javabean
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
		this.id = ++id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	public Board(String title, String content, String writer, Date regDate) {
		super();
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
	public boolean equals(Object obj) {
		
		//주소값 비교
		if(this == obj) {
			return true;
		}
		//Board클래스를 상속 받았는지 검사
		if( !(obj instanceof Board)) {
			return  false;
		}
		//3 Board의 name필드값끼리 비교
		Board b = (Board) obj;//다운캐스팅
		if(this.id==b.id) {
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}










//패키지 내용 참고하여  Person클래스 대신에 Board 클래스를 이용하여 게시판 관리 프로그램을 작성하시오

/*Board
	 필드
	int id; //게시물 번호 자동으로 번호올라가게 해서 넣기
	
	String title;//제목
	String content; //내용
	String writer; //작성자
	
	Date regDate; //작성일 new date로 객체생성해서 넣기

	패키지명 com.koitt.java.board

	Board equals 조건 비교는 id값으로 비교
	Service에서 글 등록 시 , 증가하는 번호 관리하기 Integer count; 0으로 세팅(++count)*/
