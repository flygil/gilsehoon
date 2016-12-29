package day10.exam;

public class Exam03 {
	public String[] parsing(String str1, String str2) {
		// 구현하시오.
			return new String[1];
		}
		public static void main(String[] args) {
		Exam03 ex = new Exam03();
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = ex.parsing(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		for (int i = 0; i < strs.length; i++) {
		System.out.println(strs[i]);
		}
		}
}
