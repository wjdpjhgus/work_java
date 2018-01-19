package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOTestDrive {
	public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos= null;
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream("music.mp3");
		fos = new FileOutputStream("music-copy.mp3");
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		
		
		long startTime =System.currentTimeMillis();//현재시간을 밀리초로 뽑아오는 것
		System.out.println("복사 시작 ===");
		
		byte [] buffer = new byte[100];//버퍼 사이즈 100 100바이트씩 읽어 들이는 것 아까는 1바이트씩
		
			while ((bis.read(buffer)) != -1);{
			bos.write(buffer);
			}
			long endTime =System.currentTimeMillis();
			System.out.println("복사 종료===");
			
			System.out.println("복사하는데 걸린시간: "+ (endTime-startTime) + "ms");
			
			
			//보통 체인 먼저 닫고 커넥션 닫음
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
			
			} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
	
}
}
