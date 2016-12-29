package day05.exam;

import java.util.Random;

public class Exam02 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[4];
		
		String str =""; 
		System.out.println("요소        생성된수       출력");
		for (int i = 0; i <4; i++) {
			num[i] = r.nextInt(10) + 1;
			//System.out.println(num[i]);
			for (int j = 0; j <  num[i]; j++) {
				str += "*";
			}
			System.out.printf("%d	%d	  %s", i, num[i], str);
			str = "";
			System.out.println();
		}
			
		
	}
}
