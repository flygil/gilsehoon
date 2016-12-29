package day16;

import java.io.FileWriter;

public class Test06 {
	public static void main(String[] args) {
		FileWriter fos = null;
		try {
			fos = new FileWriter("data/a2.txt", true);
			fos.write(97);
			fos.write('a');
			fos.write('가');
			fos.write("밥시간이다");
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
			} catch (Exception e2) {
				
			}
		}
	}
}
