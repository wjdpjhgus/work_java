package basicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
	public static void main(String[] args) {
		int data;
		//읽을 파일 이름 저장
		String fname ="src/basicio/ReadFiles.java";
		FileInputStream fis= null;
		try {
			//ConnectionStream, 1byte씩 읽어 들이는 FileInputStream
			fis = new FileInputStream(fname);
			//한 바이트씩 읽어 문자로 변환
			while((data =fis.read())!=-1) {
				char c =(char) data;
				System.out.print(c);

			}

		}catch (FileNotFoundException e	) {
			System.err.println("다음파일이 없습니다. : "+ fname); 
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
