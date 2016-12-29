package day11.exam;

import java.util.Arrays;

class MyArrayList {
	String[] arr = new String[4];
	int pos = 0;
	
	public String toString() {
		String result = "MyArrayList[";
		result += arr[0];
		for (int i = 1; i < pos; i++) {
			result += ", " + arr[i];
		}
		result += "]";
		return result;
	}
	
	
	void add(String data) {
		if (pos == arr.length) {
			String[] temp = new String[pos * 2];
			System.arraycopy(arr, 0, temp, 0, pos);
			arr = temp;
		}
		arr[pos++] = data;
		
	}
	String get(int get) {
		return arr[get];
	}
	int size() {
		return pos;
	}
	
	void remove(int index) {
			System.arraycopy(arr, index + 1, arr, index, pos - (index+1) );
			arr[--pos] = null;
	}
	
	void clear() {
		for (int i = 0; i < pos; i++) {
			arr[i] = null;
		}
		pos = 0;
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		//list.get(0)일 경우 "one"을반환
		String data = (String)list.get(1);
		//data : two 가 출력됨
		System.out.println("data :" + data);
		
		//add한 데이터들의 크기반환
		int size = list.size();
		//입력된 데이터크기 : 4 가 출력됨
		System.out.println("입력된 데이터의 크기 : " + size);
		
		//two 데이터를 삭제처리함
		list.remove(1);
		
		size = list.size();
		//삭제후 데이터의 크기 : 3 가 출력됨
		System.out.println("삭제후 데이터의크기 : " + size);
		
		//전체데이터 삭제
		list.clear();
		
		size = list.size();
		//전체삭제후 데이터의 크기 0 : 이 출력됨
		System.out.println("전체 삭제 후 데이터의 크기 : " + size);
		
		list.add("test");
		list.add("java");
		
		//MyArrayList[test, java] 를 출력함
		System.out.println(list);
	}
}
