package day17.exam;

import java.io.File;
import java.util.Scanner;

public class Exam01 {

	public static void dataCheck(String file1 , String file2) throws Exception{
        // 구현하세요~ ---------------------------------------------------
        // 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!

        // --------------------------------------------------------------
		//FileInputStream fis1 = null;
		//FileInputStream fis2 = null;
		
		Scanner sc1 = null;
		Scanner sc2 = null;
		boolean compare;
		int count = 1;
		try {
		File f1 = new File(file1);
		File f2 = new File(file2);
		sc1= new Scanner(f1);
		sc2 = new Scanner(f2);
		String strF1;
		String strF2;
		
			
			while(sc1.hasNextLine()) {
				strF1 = sc1.nextLine();
				strF2 = sc2.nextLine();
				compare = strF1.equalsIgnoreCase(strF2);
				if (compare) {
					System.out.println("LINE " + count + " : Equals");
					count++;
				}else {
					System.out.println("LINE " + count + " : Not Equals");
					count++;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	finally {
			sc1.close();
			sc2.close();
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
