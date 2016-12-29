package day03.exam;

import java.util.Scanner;


public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt( sc.nextLine() );
		
		if (age < 5) {
			System.out.println("입장료는 무료입니다.");	
		} else if (age <= 11) {
			System.out.println("입장료는 2500원 입니다.");	
		} else {
			System.out.println("입장료는 5000원 입니다.");	
		}
	}
}
