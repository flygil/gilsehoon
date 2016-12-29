package day04.exam;

import java.util.Random;

public class LoopTest03 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int num;
		int sum = 0;
		for (int i =1; i <= 5; i++) {
			num = r.nextInt(100) + 1;
			sum += num;
		}
		System.out.printf("합계 : %d, 평균 : %.1f", sum, sum / 5.0);
	}
}
