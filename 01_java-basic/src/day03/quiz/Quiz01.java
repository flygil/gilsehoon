package day03.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 화면에서 아래와 같이 출력될 수 있도록 코딩하시오.
		/*
		 * 5000원미만 "치즈버거를 살 수있습니다." 출력 5000원 ~ 10000원 사이일 경우
		 * "불고기 버거 세트를 살 수있습니다." 출력 10000원 보다 클 경우 경우 "패밀리 세트를 살 수있습니다." 출력
		 * 
		 * 출력형식 >
		 * 
		 * 어서오세요 고객님 롯데리아 입니다.
		 * 
		 * 현재 가진돈을 입력하세요 : 3500 치즈버거를살 수 있습니다.
		 * 
		 * 현재 가진돈을 입력하세요 : 5100 불고기 버거 세트를 살 수 있습니다.
		 * 
		 * 현재 가진돈을 입력하세요 : 10100 패밀리 세트를 살 수 있습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("어서오세요 고객님 롯데리아 입니다.");

		while (true) {
			System.out.print("현재 가진돈을 입력하세요 : ");

			int money = Integer.parseInt(sc.nextLine());

			if (money < 5000) {
				System.out.println("\"치즈버거를살 수 있습니다.\"");
			} else if (money <= 10000) {
				System.out.println("\"불고기 버거 세트를 살 수있습니다.\"");
			} else {
				System.out.println("\"패밀리 세트를 살 수있습니다.\"");
			}
		}
	}
}
