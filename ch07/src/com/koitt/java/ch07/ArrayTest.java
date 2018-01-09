/*package com.koitt.java.ch07;

public class ArrayTest {
	
	private Integer[] array;	//데이터를 담는 자료구조 //인티저는 참조형 기본값이 null값이다
	private int size;		//배열의 크기

	public ArrayTest(int size) {
		this.size = size;
		this.array= new Integer[this.size];
		
	}
	
	//자료 구조에 데이터를 추가 (index 번호에다가  해당 데이터를 저장)
	public void add(int index, int value) {
		//유효한 인덱스 값인지 검사
		if(index >= 0  && index <this.size) {
			if (this.array[index]==null) {
				this.array[index]= value;
			}
			else if (this.array[index]!=null) {
				int newSize = this.size+1; //값을 넣을때마다 배열을 새로 만들게 되어 메모리에 손실이 있다.
				if (this.array.length<newSize) {
					
					//깊은복사(Deep copy)
					Integer[]tempArray =new Integer[this.size];
					System.arraycopy(this.array, 0, tempArray, 0, this.array.length);
				
					this.size *=2;
					this.array= new Integer[this.size];
							System.arraycopy(tempArray, 0,this.array, 0, this.tempArray.length);
				}
				
				
		
				Integer[] newArray = new Integer[newSize];
				// 집어 넣으려는 index번호 앞쪽 데이터를 그대로 복사
				if (index ==0) {
					newArray[index] = value; //새로 추가하려는 값을 배열에 저장
				}
				else {
				System.arraycopy(this.array, 0, newArray, 0, index-1);
				//집어 넣으려는 index번호 뒤쪽 데이터를 한칸씩 뒤로 이동
				}
				System.arraycopy(this.array,index,newArray, index +1,this.array.length-index);
			}
			
		}
			this.array[index]=value;
		}
	
	
	
	public void remove(int index) {
		//인덱스 범위 검사
		if(index >= 0  && index <this.size) {
			
		}
	}
	
	
	public Integer[] getArray() {
		return array;
	}
	public void setArray(Integer[] array) {
		this.array = array;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i= 0; i < array.length; i++) {
			
		}
	}
}*/

package com.koitt.java.ch07;

public class ArrayTest {
	
	private Integer[] array;	// 데이터를 담는 자료구조
	private int length;			// 배열의 크기
	private int size;			// 실제 데이터의 개수
	
	public ArrayTest(int size) {
		
		this.length = size;
		this.array = new Integer[this.length];
	}
	
	// 자료구조에 데이터를 추가 (index 번호에다가 해당 데이터를 저장)
	public void add(int index, int value) {
		if (index >= 0 && index < this.length) {
			if (this.array[index] == null) {
				this.array[index] = value;
			}
			else if (this.array[index] != null) {
				int newSize = this.length + 1;
				if (this.array.length < newSize) {
					// 깊은복사(Deep copy): 기존 데이터를 손상없이 보존하기 위해서 임시로 다른 배열에 값을 복사
					Integer[] temparray = new Integer[this.size];
					System.arraycopy(this.array, 0, temparray, 0, this.array.length);
					
					// 
				this.length *= 2;
					this.array = new Integer[this.length];
					System.arraycopy(temparray, 0, this.array, 0, temparray.length);
				}
				
				// 집어 넣으려는 index번호 뒤쪽 데이터를 한칸씩 뒤로 이동
			System.arraycopy(this.array, index, this.array, index + 1, this.size - index);
				this.array[index] = value;	// 새로 추가하려는 값을 배열에 저장
			}

			this.size += 1;	// 기존 데이터 개수 + 새로운 데이터 개수
		}
	}
	
	public void remove(int index) {

		if (index >= 0 && index < this.length) {
			
		}
	}
public Integer[] get(int index) {
		return array;
	}
	

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		ArrayTest test = new ArrayTest(3);
		
		test.add(0, 2);
		for (int i = 0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();
		
		test.add(1, 3);
		for (int i = 0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();
		
		test.add(2, 4);
		for (int i = 0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();
		
		test.add(1, 1);
		for (int i = 0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();
	}
}