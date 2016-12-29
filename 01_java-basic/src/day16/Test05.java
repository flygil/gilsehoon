package day16;

import java.io.FileReader;

public class Test05 {
	public static void main(String[] args) {
		
		FileReader fis = null; 
		try {
			fis = new FileReader("data/a.txt");
			while(true) {
				int ch = fis.read();
				if (ch == -1) break;
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}	finally {
			//입출력객체를 닫기작업 수행
			if (fis != null){
				try {
					fis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
