package day08;

public class Test01 {
	public static void main(String[] args) {
		String s = new String("java is easy");
		String s2 = "java is easy";
		byte[] bArr = {97, 98, 99};
		String s3 = new String(bArr);
		System.out.printf("%s\t,%s\t,%s\t\n",s, s2, s3);
		
		System.out.println(s == s2);
		
		String s4 = "a";
		String s5 = "a";
		
		System.out.println(s4 == s5);
		
	}
}
