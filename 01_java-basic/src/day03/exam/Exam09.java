package day03.exam;

import java.util.Random;

public class Exam09 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(100) + 1;
		
		if (num % 2 == 0) {
		System.out.println("생성된 숫자(" + num + ")은 짝수 입니다.");
		} else {
			System.out.println("생성된 숫자(" + num + ")은 홀수 입니다.");
		}

	}
}
