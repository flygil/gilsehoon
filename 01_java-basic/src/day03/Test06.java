package day03;

import java.util.Scanner;

/*
 * 아래의 순서대로 선언되어야 한다.
 * package -> import ->class
 */


public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("이름을 입력하세요 : ");
		
		
		String name	= sc.nextLine();
		System.out.print("입력된 이름 : " + name);
		
	/*
	 *	이름을 입력하세요 : 홍길동
	 *	입력된 이름 : 홍길동
	 *	나이를 입력하세요 : 33
	 *	입력된 나이 : 33
	 */
		System.out.println();
		System.out.print("나이를 입력하세요 : ");
		String age	= sc.nextLine();
		System.out.print("입력된 나이 : " + age);
	}
}
