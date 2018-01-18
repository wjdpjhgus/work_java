package basicio;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIO {
	public static void main(String[] args) throws IOException {
		int c;
		byte b[] = {'a','b', 'c', 'd'};

		//배열 b를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		//배열 b를 소문자를 대문자로 출력하는 ByteArrayOutputStream 객체를 생성
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();

		System.out.println("문자를 읽어 대문자로 출력");
		while ((c =bInput.read()) != -1) { //파일 끝이나 배열의 끝은 -1
			System.out.print((char)c);
			//객체 ByteArrayOutputStream에 대문자를 출력
			bOutput.write(Character.toUpperCase((char)c));

		}
		System.out.println();
		//객체ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력
		System.out.println(bOutput);
		//배열 Array 메소드 toString()사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(bOutput.toByteArray()));

	}
}
