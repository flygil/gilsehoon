package day03.exam;

import java.util.Random;

public class Exam10 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int score = r.nextInt(100) +1;
		
		System.out.println("점수 : " + score);
		
		if(score <60) {
			System.out.println("재수강");
		} else if (score <= 90) {
			System.out.println("잘했어요");			
		} else {
			System.out.println("당신은 장학생");			
		}
	}
}
