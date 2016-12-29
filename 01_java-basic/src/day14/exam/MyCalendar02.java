package day14.exam;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar02 {
	private static Scanner sc = new Scanner(System.in);
	static Calendar c ;
	public static void main(String[] args) {
		
			while(true) {
				switch(menu()) {
				case 1: thisMon();break;
				case 2: selectMon(-1);break;
				case 3:	 selectMon(1);break;
				case 0: System.out.println("달력프로그램을 종료합니다.");System.exit(0);
				
				}
			}
		
		
	}


	public static int menu() {
		System.out.printf("항목을 선택하세요 (1.현재달 보기 2.이전달 보기 3.다음달 보기 0.종료) : ");
		return Integer.parseInt( sc.nextLine() );
	
	}

	
	public static void thisMon() {
		c = Calendar.getInstance();
		int dow = c.get(Calendar.DAY_OF_WEEK);
		int maxday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int count = 0;
		
		System.out.printf("%d년 %d월\n",c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
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
	
	
	public static void selectMon(int select) {
		c.add(Calendar.MONTH, select);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		int maxday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int count = 0;
		
		System.out.printf("%d년 %d월\n",c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
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