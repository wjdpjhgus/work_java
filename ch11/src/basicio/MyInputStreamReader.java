package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {
		String line;
		//읽을 파일 이름 지정
		String fname = "src/basicio/MyInputStreamReader.java";//불러올 파일 경로
		
		try {
			//읽을 파일 이름으로 FileInputStream생성
			FileInputStream fis = new FileInputStream(fname);//커넥션 스트림에 연결
			
			//FileInputStream을 다신 InputStreamReader로 연결
			InputStreamReader isr = new InputStreamReader(fis);

			//현재 InputStreamReader인코딩 방식을 출력
			System.out.println(isr.getEncoding());
			
			//InputStreamReader을BufferedReader로 연결
			BufferedReader br = new BufferedReader(isr);
			System.out.println();

			//한줄씩 읽어 출력->바이트 하나씩 읽는것보다 더 빠르다.
			while ((line =br.readLine()) !=null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
		}catch (FileNotFoundException e	) {
			System.out.println("다음 파일이 없습니다. :"+ fname);
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();

	}

}
