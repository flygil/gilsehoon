package day05.exam;

import java.util.Random;

public class Exam03 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] countNum = new int[45];
		
		for (int i = 0; i < 10000; i++) {
			int randomNum = r.nextInt(45) + 1;
			countNum[randomNum - 1]++;
		}
		for(int j = 0; j < countNum.length; j++) {
		System.out.printf("%d : %d\n",j + 1, countNum[j]);
		}
	}
}
