package day14;

import java.util.Calendar;

public class Test02 {
	public static void main (String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		
		//int month = c.get(2) + 1;
		int month = c.get(Calendar.MONTH) + 1;
		
		int date = c.get(Calendar.DATE);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(dayofweek);
		
		
	}
}
