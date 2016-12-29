package day03.exam;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt( sc.nextLine() );
		
		if (num < 0) {
			System.out.println(num + "의 절대값 : " + num*-1);
		} else {
			System.out.println(num + "의 절대값 : " + num);
			
		}
	}
}
