package day03.exam;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
	System.out.print("초를 입력하세요 : ");
	
	Scanner sc = new Scanner(System.in);
	int time = Integer.parseInt( sc.nextLine() );
	
	System.out.println(time + "초는 " +  time / 3600 + "시간 " 
	+ (time % 3600) / 60 + "분 " + (time % 3600) % 60 + "초입니다.");
	
	}
}
