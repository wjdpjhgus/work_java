package basicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//2byte씩 읽는다
public class MyFileReaderWriter {
	public static void main(String[] args) {
		int data;
		String inFname = "src/basicio/MyFileReaderWriter.java";
		String outFname = "src/basicio/MyFileReaderWriter.back";
				
				try {
					FileReader fr = new FileReader(inFname);
					FileWriter fw = new FileWriter(outFname);
					
					while ((data = fr.read()) !=-1) {
						System.out.print((char) data);
						fw.write(data);
					}
					fr.close();
					fw.close();
					System.out.println();
					System.out.println("위 파일이 생성되었습니다. :" + outFname);
				}catch (FileNotFoundException e) {
					System.err.println("다음파일이 없습니다. :" + inFname);
				}catch (IOException e) {
					System.err.println(e);
				}
	}
}
