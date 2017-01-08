package day08;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		
		/*
		//static String	valueOf(boolean b)
		//-Returns the string representation of the boolean argument.
		 * 
		 * 
		String result = String.valueOf(true);
		System.out.println(result);
		result = result + "a";
		System.out.println(result);
		*/
		
		
		/*
		//static String	format(Locale l, String format, Object... args)
		//-Returns a formatted string using the specified locale, format string, and arguments.
		 
		 
		System.out.printf("나이 : %d, 이름 : %s\n", 33, "이진호");
		String result = String.format("나이 : %d, 이름 : %s\n", 33, "이진호");
		System.out.println(result);
		*/
		
		
		/*
		String s = "java is easy";
	 	//String	trim()
		//-Returns a string whose value is this string, with any leading and trailing whitespace removed.
		 * 
		 * 
		s = "     a b c d e     ";
		System.out.println("|" + s + "|" );
		System.out.println("|" + s.trim() + "|");
		System.out.println("|" + s.replace(" ", "") + "|");
		
		*/
		

		/*//String[]	split(String regex)
		//-Splits this string around matches of the given regular expression.
		 * 
		 * 
		s = "수지:33:분당:suzy@a.com";
		String[] result = s.split(":");
		System.out.println(Arrays.toString(result));*/
			
			
	
		//String	substring(int beginIndex)
		//-Returns a string that is a substring of this string.
		//String	substring(int beginIndex, int endIndex)
		//-Returns a string that is a substring of this string.
		String s = "java is easy";
		
	//	String result = s.substring(2);
	//	System.out.println(result);
		String result = s.substring(2,3);
		System.out.println(result);
		
		
		
		
		
		/*
		//String	toLowerCase()
		//-Converts all of the characters in this String to lower case using the rules of the default locale.
		System.out.println(s.toLowerCase());
		
		//String	toUpperCase()
		//-Converts all of the characters in this String to upper case using the rules of the default locale.
		System.out.println(s.toUpperCase());
		
		//char[]	toCharArray()
		//-Converts this string to a new character array.
		//char[] arr = s.toCharArray();
		//-System.out.println(Arrays.toString(arr));
		
		//String	replace(CharSequence target, CharSequence replacement)
		//Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
		
		s.replace("easy", "hard");
		System.out.println(s);

		s = s.replace("easy", "hard");
		System.out.println(s);
		
		s = "a1de3rr45t5667gg";
		for (int i = 0; i < 10; i++) {
			s = s.replace("" + i, "*");
		}	
		System.out.println(s);
		
		//String	replaceAll(String regex, String replacement)
		//Replaces each substring of this string that matches the given regular expression with the given replacement.
		
		s = "a1de3rr45t5667gg";
		s = s.replaceAll("[0-9]", "*");
		System.out.println(s);

		s = "a1de3rr45t5667ggFEWSAAAADCeeo";
		s = s.replaceAll("[A-Za-z]", "*");
		System.out.println(s);
		*/
		
		
		
		/*
		//boolean	startsWith(String prefix)
		//Tests if this string starts with the specified prefix.
		
		boolean bool = s.startsWith("java");
		System.out.println("startWith : " + bool);
		
		//boolean	endsWith(String suffix)
		bool = s.endsWith("easy");
		System.out.println("endsWith : " + bool);
		*/
		
		
		/*	
		//int	lastIndexOf(String str)
		//-Returns the index within this string of the last occurrence of the specified substring.
		//int	lastIndexOf(String str, int fromIndex)
		//-Returns the index within this string of the last occurrence of the specified substring,
		// searching backward starting at the specified index.
		int index = s.lastIndexOf("a");
		System.out.println("lastIndexOf : " + index);
		index = s.lastIndexOf("a", index - 1);
		System.out.println("lastIndexOf : " + index);
		*/
		
		
		
		
		//int	indexOf(String str)
		//Returns the index within this string of the first occurrence of the specified substring.
		//int	indexOf(String str, int fromIndex)
		//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
	//	String s = "java is easy";
	//	int index = s.indexOf("va");
	//	System.out.println("indexOf : " + index);
	//	index = s.indexOf("a", index + 1);
	//	System.out.println("indexOf : " + index);
	//	index = s.indexOf("a", index  + 1);
	//	System.out.println("indexOf : " + index);
		
		
		
		
		/*
		//boolean	contains(CharSequence s) 문자열안에 특정한 문자가 포함되어 있는지 반환
		boolean bool = s.contains("is");
		System.out.println("contains : " + bool);
		*/
		
		
		
		/*
		//boolean	equals(Object anObject) 두문자열의 같음(대소문자 구별)을 비교해서 참/거짓 반환 
		//boolean	equalsIgnoreCase(String anotherString)  두문자열의 같음(대소문자 무시)을 비교해서 참/거짓 반환 
		String s1 = "Java Is Easy";
		
		boolean bool = s.equals(s1);
		System.out.println("equals : " + bool);
		bool = s.equalsIgnoreCase(s1);
		System.out.println("equalsIgnoreCase : " + bool);
		*/
		
		
		/*
		//char charAt(int index) 문자열에서 선택한 인덱스를 char로 반환
		char ch = s.charAt(0);
		System.out.println(ch);
		ch = s.charAt(5);
		System.out.println(ch);
		
		//int length() 문자열의 길이 반환
		int len = s.length();
		System.out.println("길이 : " + len);
		*/
	}
	
}
