package day04.exam;

import java.util.Random;
public class LoopTest11 {
	public static void main(String[] args) {
		int[] luckyNum = new int [6];
		Random r = new Random();
		boolean flag = true;
		int compare;
		
		for (int j = 1; j <= 5; j ++) {
			System.out.print("Set" + j + ": ");
			for (int i = 0; i <= 5; i++) {
				luckyNum[i] = r.nextInt(45) + 1;
				compare = luckyNum[i];
				
				if (i >= 1) {
					for(int k = i-1; k >= 0  ; k--) {
						if (compare == luckyNum[k]) {
							--i;
							flag = false;
						}
					}
					
				}
				if (flag == true)
				System.out.printf("%2d ",luckyNum[i] );
				else flag = true;
			}
		System.out.println();
		}
	}	
}
