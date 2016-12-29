package day14;


import java.util.Calendar;
import java.util.Date;


public class Test03 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();

		
		/*
		// Calendar -> Date 객체얻기
		Date d = c.getTime();
		
		//Date의 시간정보를 이용해서 Calendar 시간을 설정
		c.setTime(d);
	
		
		long time = d.getTime();
		System.out.println(time);
		c.setTimeInMillis(time);
		*/
		
		
		
		
		/*
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val);
		
		c.add(Calendar.MONTH, -1);
		val = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val);
		*/
		
		
		/*
		//날짜정보변경
		c.set(2014, 1, 10); //2014.2.10
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		c.set(Calendar.DATE, 1);
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		c.add(Calendar.YEAR, 1);
		year = c.get(Calendar.YEAR);
		System.out.println(year);
		*/
		
	}
}
