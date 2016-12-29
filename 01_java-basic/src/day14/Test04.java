package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test04 {
	public static void main(String[] args) {
		Date d = new Date();
		
		
		/*
		 * 패턴문자
		 * y : 년도
		 * M : 월
		 * d : 일
		 * h : 시간
		 * m : 분
		 * s : 초
		 * 
		 * 	2016-11-11	: yyyy-MM-dd
		 * 	11:50:23	: hh:mm:ss
		 * 	2016-11		: yyyy-mm 	
		 */
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//format: 날짜정보에서 문자열을 얻기
		//parse : 문자열에서 날짜객체 얻기
		String timeStr = sdf.format(new Date());
		System.out.println(timeStr);
		try {
		Date date = sdf.parse("2015-01-01");
		System.out.println("변경된 날짜정보 : " + date);
		}catch(ParseException pe) {
			System.out.println("parseException");
			pe.printStackTrace();
		}
	}
}
