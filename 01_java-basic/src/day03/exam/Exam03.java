package day03.exam;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {

		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		int radius = Integer.parseInt( sc.nextLine() );
		
		System.out.println("반지름이 " + radius + 
				"인 원의 면적은 " + radius*radius*PI + "입니다.");
		
		
		
	}
}
