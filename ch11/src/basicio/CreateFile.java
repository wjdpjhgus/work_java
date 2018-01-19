package basicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		//읽을 파일 이름지정
		String fname = "src/basicio/newfile.txt";
		//File객체 생성
		File f = new File(fname);
		//실제 파일 존재 여부 확인
		if( ! f.exists()) {
			//처음 실행하면 파일이 없으므로 실행됨
			System.out.println("다음 파일을 찾을수 없습니다. :" +fname);
		}
		//새로이 파일을 만들어 문자열 쓰기
		try {
			f.createNewFile();//newfile.txt 빈파일 만들어짐
			
			if(f.exists()) {//이제는 존재함 true
				System.out.println("다음 파일이 있습니다.: "+ fname);

			}
			
			//newfile.txt에 내용 넣기
			FileWriter fr = new FileWriter(f); //FileWriter은 connectionStream
			fr.write("파일 내용이 들어값니다. ");//입력한 내용이 파일에 들어감
			fr.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
