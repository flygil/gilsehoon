package day08;

public class Test02 {
	public static void main(String[] args) {
		String s1 = "a";
		//StringBuffer 와 StringBuilder는 자신의 공간값을 변경
		//차이점 StringBuffer는 동기화 StringBuilder는 비동기화
		StringBuffer sb = new StringBuffer(s1);
		//1.5
		StringBuilder s3 = new StringBuilder("a");
		
		System.out.println("측정시작!");
		long s = System.currentTimeMillis();
		for (int i =0; i < 100000; i++ ) {
			s1 += i;
		}
		long e = System.currentTimeMillis();
		double time = (e - s)/1000.0;
		System.out.println("String : " + time);
		
		s = System.currentTimeMillis();
		for(int i = 0; i < 100000; i ++) {
			sb.append(i);
		}
		e = System.currentTimeMillis();
		time = (e - s)/1000.0;
		System.out.println("StringBuffer : " + time);
	}
	
}
