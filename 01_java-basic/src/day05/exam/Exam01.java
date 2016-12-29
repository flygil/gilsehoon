package day05.exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] animal = {"원숭이띠", "닭띠", "개띠", "돼지띠", "쥐띠", "소띠", "호랑이띠", "토끼띠", "용띠", "뱀띠",
				"말띠", "양띠", } ;
		System.out.print("당신의 태어난 년도를 입력하세요 : ");
		int inputYear = Integer.parseInt(sc.nextLine());
		
		int det = inputYear % 12;
		System.out.printf("%d년에 태어난 당신은 %s 입니다.", inputYear, animal[det]);
		
	}
}
