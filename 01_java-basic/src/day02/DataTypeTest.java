package day02;

public class DataTypeTest {
	public static void main(String[] args) {
		//기본형은 8가지이고 소문자로 시작한다.
		//논리형 , 문자형 , 숫자
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
				
		char ch = 65;
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		ch ='\u0061';
		System.out.println(ch);
		//숫자형
		byte b = 127;
		short s = 1;
		int i = 1;
		long l = 1l;
		l = 1L;
		
		float f = 1.1f;
		f = 1.1F;
		double d = 1.1;
		
	}
}

