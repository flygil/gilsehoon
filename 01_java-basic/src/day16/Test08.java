package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test08 {
	public static void main(String[] args) {
		// Kalimba.mp3
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("data/Kalimba.mp3");
			fos = new FileOutputStream("data/Kalimba1.mp3");
			
			System.out.println("복사시작..");
			long s = System.currentTimeMillis();
			
			while(true) {
				int ch = fis.read();
				if (ch == -1) break;
				
				fos.write(ch);
			}
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("복사완료시간 : " + time);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (fis != null) {
				try {
					fis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
