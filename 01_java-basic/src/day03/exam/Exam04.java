package day03.exam;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i1 = Integer.parseInt( sc.nextLine() );
		
		System.out.print("나눌 수를 입력하세요 : ");
		int divider = Integer.parseInt( sc.nextLine() );
		
		System.out.println("몫 : " + i1/divider);
		System.out.println("나머지 : " + i1%divider);
	}
}
