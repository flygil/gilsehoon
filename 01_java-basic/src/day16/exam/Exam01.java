/*
 *   exam01.txt 파일의 내용을 읽어서
 *   exam01-result.txt 파일에 아래의 형식으로 저장하는 프로그램 작성
 *   
     89
	 19
	 77
	 90
	 총점 : ...
	 평균 : ...
	 최고점 : ...
	 최저점 : ...
 */
package day16.exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Exam01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		int sum = 0;
		int max, min;
		int index = 0;
		int count = 0;
		String[] arr = {"","","",""}; 
				//new String[4];
		try {
			fr = new FileReader("src/day16/exam/exam01.txt");
			fw = new FileWriter("src/day16/exam/exam01-result.txt", true);
			while(true) {
				int ch = fr.read();
				if (ch == -1) break;
				
				if (ch == '\r')
					ch = fr.read();
				if (ch == '\n'){ 
					ch = fr.read();
				}
				arr[index] += String.valueOf((char)ch);
				count++;
				fw.write(ch);
				if (count == 2) {
					index++;
					fw.write("\n");
					count = 0;
				}
				
			}
			System.out.println(Arrays.toString(arr));
			
			max = Integer.parseInt(arr[0]);
			min = Integer.parseInt(arr[0]);
			sum += max;
			for (int i = 1; i < arr.length; i++) {
				if (max < Integer.parseInt(arr[i])) {
					max = Integer.parseInt(arr[i]);
				}
				if (min > Integer.parseInt(arr[i])) {
					min = Integer.parseInt(arr[i]);
				}
				sum += Integer.parseInt(arr[i]);
			}
			//String str = "";
			//str += "총점 :" + sum;
			System.out.println(sum);
			
			try {
				fw.write("총점 :" + sum + "\n" );
				fw.write("평균 : " + sum/arr.length + "\n");
				fw.write("최고점 :" + max + "\n");
				fw.write("최저점 :" + min + "\n");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		
		

		
	}

}











