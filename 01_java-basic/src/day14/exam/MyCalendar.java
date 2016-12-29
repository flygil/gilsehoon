package day14.exam;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
				
		while(true) {
			switch(menu()) {
			case 1: selectYear();break;
			case 2: selectMonth();break;
			case 3: System.out.println("종료합니다.");System.exit(0);
			}
		}
		
	}
	public static int menu() {
		System.out.printf("항목을 선택하세요 (1.특정년도 날짜보기 2.특정월 날짜보기 3.종료) : ");
		return Integer.parseInt( sc.nextLine() );
	}

	public static void selectYear() {
		System.out.printf("년도를 입력하세요 : ");
		int year = Integer.parseInt( sc.nextLine() );
		int dow;
		int maxday;
		Calendar c = Calendar.getInstance();
		int count;
		for (int i = 0; i < 12; i++) {
			count = 0;
			c.set(year, i, 1);
			dow = c.get(Calendar.DAY_OF_WEEK);
			maxday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.printf("%d년 %d월\n",year, i+1);
			System.out.println("---------------------------------------------------");
			System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
			System.out.println("---------------------------------------------------");
				for(int j = 1; j < dow; j++) {
					System.out.printf("%2s\t"," ");
					count++;
				}
				for (int k = 1; k <= maxday; k++){
					System.out.printf("%2d\t", k);
					count++;
					if (count == 7) {
						System.out.println();
						count = 0;
					}
				}System.out.println();
					System.out.println("---------------------------------------------------");
		}
	}
	
	
	
	public static void selectMonth() {
		System.out.printf("년도를 입력하세요 : ");
		int year = Integer.parseInt( sc.nextLine() );
		System.out.printf("월을 입력하세요 : ");
		int month = Integer.parseInt( sc.nextLine() );
		Calendar c = Calendar.getInstance();
		int dow = c.get(Calendar.DAY_OF_WEEK);
		int maxday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int count = 0;
		
		System.out.printf("%d년 %d월\n",year, month);
		System.out.println("---------------------------------------------------");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("---------------------------------------------------");
			
		for(int j = 1; j < dow; j++) {
				System.out.printf("%2s\t"," ");
				count++;
			}
		for (int k = 1; k <= maxday; k++){
			System.out.printf("%2d\t", k);
			count++;
			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
	}
	
}
