package day03.exam;

import java.util.Random;

public class Exam08 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int score = r.nextInt(100) + 1;
		
		if (score < 60) {
			System.out.println("생성된 점수 : " + score + "(불합격)");
		} else {
			System.out.println("생성된 점수 : " + score + "(합격)");
		}

	}
}
