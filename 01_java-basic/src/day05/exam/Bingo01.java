package day05.exam;

import java.util.Random;
import java.util.Scanner;

public class Bingo01 {
	public static void main(String[] args) {
		int[] luckyNum = new int [25];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int compare;
		int rowCount = 0;
		
		//for (int j = 1; j <= 5; j ++) {
			//System.out.print("Set" + j + ": ");
			for (int i = 0; i < 25; i++) {
				luckyNum[i] = r.nextInt(25) + 1;
				compare = luckyNum[i];
				if (i >= 1) {
					for(int k = i-1; k >= 0  ; k--) {
						if (compare == luckyNum[k]) {
							--i;
							flag = false;
						}
					}
				}
				if (flag == true){
				System.out.printf("%3d",luckyNum[i] );
				++rowCount;
					if (rowCount % 5 == 0 )
						System.out.println();
				}else flag = true;
			}
		//System.out.println();
		//}
			int countBingo = 0;
		//	int straight = 0;
			boolean bingo = false;
			while(!bingo) {
				rowCount = 0;
				System.out.print("번호를 입력하세요 : ");
				int selectNum = Integer.parseInt(sc.nextLine());
				
				for (int i = 0; i < luckyNum.length; i++) {
					if (selectNum == luckyNum[i]){
						luckyNum[i] = 42;
					}
					if (luckyNum[i] != 42) {
						System.out.printf("%3d", luckyNum[i]);
						++rowCount;
					}else {
						System.out.printf("%3c", luckyNum[i]);
						++rowCount;
					}
					if (rowCount % 5 == 0 )
						System.out.println();
				}
				
				
				//1씩증가 5개 빙고체크
				for (int j = 0; j < 25; j += 5){
					int straight = 0;
					for (int k = j; k < j + 5; k++){
						int compare1;
						compare1 = luckyNum[k];
						if (compare1 != 42) {
							break;
						}else ++straight;
					}
					if (straight == 5) ++countBingo;
				}
//				System.out.println("현재빙고카운트(1증가) : " + countBingo );
				
				//5씩증가 5개 빙고체크
				for (int j = 0; j < 5; j++){
					int straight = 0;
					for (int k = j; k < 25; k += 5){
						int compare5;
						compare5 = luckyNum[k];
						if (compare5 != 42) {
							break;
						}else ++straight;
						if (straight == 5) ++countBingo;
					}
				}
//				System.out.println("현재빙고카운트(1+5증가) : " + countBingo );
				//4씩증가 1개 빙고체크
				int straight = 0;
				for (int k = 4; k <= 20; k += 4){
					int compare4;
					compare4 = luckyNum[k];
					if (compare4 == 42) ++straight;
					if (straight == 5) ++countBingo;
				}
//				System.out.println("현재빙고카운트(1+5+4)  : " + countBingo );
				//6씩증가 1개 빙고체크
				straight = 0;
				for (int k = 0; k <= 24; k += 6){
					int compare6;
					compare6 = luckyNum[k];
					if (compare6 == 42) ++straight;
					if (straight == 5) ++countBingo;
				}
//				System.out.println("현재빙고카운트(전부) : " + countBingo );
						
				if (countBingo == 5) bingo = true;
				else countBingo = 0;
			}
			
			System.out.printf("빙고 카운트 : %d\n빙고!~~\n빙고게임을 종료합니다.", countBingo);
			
	}	
}
