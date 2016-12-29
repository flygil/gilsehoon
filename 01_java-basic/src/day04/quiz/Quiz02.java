package day04.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int solution = 500;//r.nextInt(1000) + 1;
		boolean flag = false;
		String s = "";
		System.out.println("1부터 1000사이의 숫자를 맞추는 게임입니다.(총10회)");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "회. 숫자를 입력하세요 (1 -1000) : ");
			int num = Integer.parseInt(sc.nextLine());
			if (num == solution) {
				System.out.println("정답입니다.");
				flag = true;
				break;
			} else if (num < solution) {
				 s = "큰";
			} else {
			s = "작은";
			}
			System.out.printf("%d보다 %s값 입니다.\n", num, s);				
		}
		if (flag == false) 
		System.out.println("10회 끝 정답은 " + solution + " 입니다.");				
	}
}
