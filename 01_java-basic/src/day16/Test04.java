package day16;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Test04 {
	public static void main(String[] args) {
		
		
		//화면에서 데이터 읽기 : 문자처리
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		try {
			while (true) {
				int ch = isr.read();
				System.out.print((char)ch);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		//화면에서 데이터 읽기
		InputStream in = System.in;
		//System.out.println("입력 : ");
		try {
			while (true) {
				int ch = in.read();
				System.out.print((char)ch);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
}
