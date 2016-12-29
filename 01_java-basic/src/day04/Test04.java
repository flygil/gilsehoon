package day04;

public class Test04 {
	public static void main(String[] args) {
		/*
		*for (1.초기값; 2.조건식; 3.증감) {
			 *
			 * 	4.
			 * 	실행문장
			 * 	실행문장
			 * }
			 * 5.
			 * 
			 * 1.초기값
			 * while (2.조건식) {
			 * 4.실행문장
			 * 3.증감
			 * }
			 * 5.
			 * 
			 */ 
		
		System.out.println("for 문" );
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("while 문" );
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
				
	}
}
