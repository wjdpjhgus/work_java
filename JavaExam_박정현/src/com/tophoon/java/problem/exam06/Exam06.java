package com.tophoon.java.problem.exam06;

public class Exam06 {

	public static void main(String[] args) {
		Shape A[]= {new Circle(3.0, 4.0, 4.82), new Rectangle(2.0, 3.0, 3.67, 7.89)};
		Printer B[] = {new Circle(3.0, 4.0, 4.82), new Rectangle(2.0, 3.0, 3.67, 7.89), new Other(1)};
		for(int i=0; i<=1; i++) {
			A[i].draw();
			System.out.println();
		}
			int a = 0;
			while (a<=2) {
				B[a].printClassName();
				a++;
			}
		}
		
		
	}



/*9. main 메소드에서 아래와 같이 작성

- Shape 배열을 만들고 그 배열에 Circle과 Rectangle 객체를 집어 넣는다.

- for문을 이용하여 Shape 배열에 있는 객체의 draw() 메소드 호출

- Printer 배열을 만들고 그 배열에 Circle, Rectangle, Other 객체를 집어 넣는다.

- while문을 이용하여 Printer 배열에 있는 객체의 printClassName() 메소드 호출

 

출력예시)

중심좌표 (x, y) = 3.0, 4.0

반지름: 4.82, 원 면적: 72.99

중심좌표 (x, y) = 2.0, 3.0

가로: 3.67, 세로: 7.89, 사각형 면적: 28.96

Circle

Rectangle

Other*/