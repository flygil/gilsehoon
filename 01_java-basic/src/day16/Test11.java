package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test11 {
	public static void main(String[] args) {
		// Kalimba.mp3
		
		try(
			FileInputStream fis = new FileInputStream("data/Kalimba.mp3");
			FileOutputStream fos =  new FileOutputStream("data/Kalimba4.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			
			System.out.println("복사시작..");
			long s = System.currentTimeMillis();
			while(true) {
				int ch = bis.read();
				if (ch == -1) break;
				
				bos.write(ch);
			}
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("복사완료시간 : " + time);
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
}
