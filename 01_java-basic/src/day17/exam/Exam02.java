package day17.exam;

import java.io.File;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
        try {
            searchFileContent("data/find.txt", "System");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param readFileName : 읽을 파일명
     * @param findStr      : 파일에서 찾을 내용
     * @throws Exception
     */
    public static void searchFileContent(String readFileName, String findStr) throws Exception {
            
            // 아래 부분에 내용을 구현합니다. 클래스의 다른 부분은 변경하지 않습니다.

            ////////////////////////////////////////////////////
    	Scanner sc = null;
    	String strF;
    	int count = 1; 
    	try {
    		File f = new File(readFileName);
    		sc =new Scanner(f);
    		
    		while(sc.hasNextLine()) {
    			strF = sc.nextLine();
    			if(strF.contains(findStr)) {
    				System.out.println(count + " :" + strF);
    			}
    			count++;
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sc.close();
		}
    	
    }
}
