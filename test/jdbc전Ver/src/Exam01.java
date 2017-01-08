

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam01 {

	public static void dataCheck(String file1 , String file2) throws Exception{
        // 구현하세요~ ---------------------------------------------------
        // 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!

        // --------------------------------------------------------------
		//FileInputStream fis1 = null;
		//FileInputStream fis2 = null;
		boolean compare;
		int count = 1;
		try(FileInputStream fis1 = new FileInputStream("data/data1.txt");
			FileInputStream	fis2 = new FileInputStream("data/data2.txt");
				) {
			
			while(true) {
				int ch1 = fis1.read();
				int ch2 = fis2.read();
				if (ch1 == -1 || ch2 == -1) break;
				compare = ch1 == ch2 ? true : false;
				/*
				if (!compare) {
					count++;
					continue;
				}
				*/
				if (ch1 == '\n')  {
					if (compare) {
						System.out.println("LINE" + count + " : Equal\n");
					}else {
						System.out.println("LINE" + count + " : Not Equal\n");
					}
					while (ch2 != '\n') {
						ch2 = fis2.read();
					}
				count++;
				}else if (ch2 == '\n') {
					if (compare) {
						System.out.println("LINE" + count + " : Equal\n");
					}else {
						System.out.println("LINE" + count + " : Not Equal\n");
					}
					while (ch1 != '\n') {
						ch1 = fis1.read();
					}
				count++;
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
    }   
    
    // main 메서드는 수정하지 마세요.
    public static void main(String[] args) throws Exception {       
        try {
            dataCheck("data/data1.txt", "data/data2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
    
    
}
