package basicio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream {
	public static void main(String[] args) {
		FileOutputStream fos;		//ConnectionStream (Source 또한  Destination에 직접연결가능)
		BufferedInputStream bis;	//chainStream(Source 또는 Destination에 직접연결이 불가능)
		BufferedOutputStream bos;	//chainStream
		String fname ="src/basicio/test.buff";

		try {
			//새로만들 파일 이름으로 fileOutputStream 생성
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte data[] = {'A','B','C','D','E'};
			
			//한바이트씩 읽어 FileOutputStream으로 출력
			bos.write(data, 0, 5);//0은 인덱스 5는 길이 파일에 ABCDE가 입력되어있음
			bos.close();
			
			fos.close();
			System.out.println(fname + " :파일이 생성되었습니다.");
			
			
			//읽을 파일 이름으로 FileInputStream 생성
			bis = new BufferedInputStream(new FileInputStream(fname));//BufferedInputStream만 close해도 FileInputStream도 닫아줌
			data = new byte[10];
			bis.read(data,0,10);
			bis.close();
			System.out.println(Arrays.toString(data));//[0000]은 값이 없으니깐 0
		}catch (IOException e) {
			System.err.println(e);
		}
	}
}
