package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectIOTestDrive {


	public static void main(String[] args) {

		//팡일에 저장할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길순", "부산", 28);
		Person p3 = new Person("홍길자", "전주", 35);


		//1.Connection Stream, Chain Stream 생성
		//이클립스 입장에서 이클립스에 있는것을 파일에 꺼내놓음
		ObjectOutputStream oos = null;//Chain Stream 보조역할
		FileOutputStream fos = null;//Connection Stream

		try {
			//person.dat 파일을 Destination으로 지정
										//목적지 파일명
			fos = new FileOutputStream("person.dat");
			oos= new ObjectOutputStream(fos);

			//커넥트 스트림을 이용해서 객체들을 개울가에 띄워 올림
			oos.writeObject(p1);//객체 싣는것
			oos.writeObject(p2);
			oos.writeObject(p3);

			oos.writeObject(null);// 더이상 떠내려 올 객체가 없다는 것을 알려주기 위해 null값을 띄워 올림

			//writeObject메소드가 ObjectOutputStream과 FileOutputStream을 거쳐 person.dat까지 객체를 보낸다.
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				oos.close();
				fos.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			} 
		}

		System.out.println("객체 정보를 파일에 저장완료 했습니다...");

		//************************************************************
//파일에 저장된 객체 읽어오기(이클립스 입장에서 파일에서 이클립스에 넣음)
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("person.dat");//Connection Stream
			ois = new ObjectInputStream(fis);		//Chain Stream

			Object item = null;
			while ((item= ois.readObject())!=null) {
				System.out.println(item);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();
		}catch (ClassNotFoundException e) {

			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			} 
		}
	} 

}

