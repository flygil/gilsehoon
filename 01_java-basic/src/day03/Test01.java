package day03;

import day02.ParseIntTest;

public class Test01 {
	public static void main(String[] args) {
		
		
		Test01 t01;
		t01 = new Test01();
		
		
		
		int i = 100;
		byte b = 100;
		
		//묵시적(암묵적)형변환, 업캐스팅
		int i2 = b;
		
//		byte b2 = i; //컴파일에러발생
		//명시적형변환, 다운캐스팅
		byte b2 = (byte)i;
		System.out.println(i2);
		System.out.println(b2);

	char c ='a';
	int i3 = c;
	System.out.println(i3);
	
	char c2 ='C';
	int i4 = c2;
	System.out.println(i4);

	int i5 = 'C';
	System.out.println(i5);
	
	System.out.println( (int)'C' );
	
	
	
	}
}
