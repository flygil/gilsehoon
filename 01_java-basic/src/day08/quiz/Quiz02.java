package day08.quiz;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Quiz02 {
	public static void totalMovieCount() throws Exception {
		//실행시에 아래와 같은결과가 출력되도록 코드를 작성하시오.
		/*
		 * 전체 상영된 영화 4편
		 * 
		 */
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		int count = 0;
		int countT = 0;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			count++;
			String[] title = s.split(":");
			//int title = s.indexOf(":");
			//System.out.println(Arrays.toString(title));
			if(title[0].length() == 2) countT++;
			
		}
		System.out.printf("전체 상영된 영화 %d편\n",count);
	}

	public static void getMovieCountByNameLength(int len) throws Exception {
		//실행시에 아래와 같은결과가 출력되도록 코드를 작성하시오.
		/*
		 * 제목이 2글자인 영화2편
		 */
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		int count = 0;
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			String[] arr = s.split(":");
			//int title = s.indexOf(":");
			//System.out.println(Arrays.toString(arr));
			if(arr[0].length() == len) 
				count++;
			
		}
		System.out.printf("제목이 %d글자인 영화 %d편\n",len, count);
	}

	public static void getMovieCountByYear(int year) throws Exception {
		//실행시에 아래와 같은결과가 출력되도록 코드를 작성하시오.
		/*
		 * 제목이 2글자인 영화2편
		 */
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		int count = 0;
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			String[] arr = s.split(":");
			//int title = s.indexOf(":");
			//System.out.println(Arrays.toString(arr));
			if(Integer.parseInt(arr[2]) == year) 
				count++;
			
		}
		System.out.printf("제목이 %d글자인 영화 %d편\n",year, count);
	}

	public static void main(String[] args) throws Exception {
		//전체 상영된 영화 카운트
		totalMovieCount();
		// 제목이 지정된 글자수와 같은 영화
		getMovieCountByNameLength(2);
		//영화 상영 년도를 기준으로 카운트 조회
		getMovieCountByYear(2016);
		
	}
}