package day04.exam;

import java.util.Random;

public class LoopTest09 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(11) +10;
		boolean flag = true;
		int count = 0;
		int countMinor =0;
		
		System.out.println("랜덤 수 :  " + num);
		System.out.print("소수 :  ");
		
		outer :
		while(flag) {
			for(int i = 1; true; i++) {
				count = 0;
				for(int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					countMinor++;
				System.out.print(i + " ");
				} 
				if (countMinor == num) {
					flag = false;
					break outer ;
				}
			}			
		}
	}
}
