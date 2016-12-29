package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test10 {
	public static void main(String[] args) {
		// Kalimba.mp3
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("data/Kalimba.mp3");
			fos = new FileOutputStream("data/Kalimba4.mp3");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
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
		} finally {

			if (bis != null) {
				try {
					bis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
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
