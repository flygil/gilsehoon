package day07.exam;

public class MethodUtil {
	boolean isLowerChar(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;
		if (ch >= 'A' && ch <= 'Z')
			return false;
		return false;
	}
	
	boolean isUpperChar(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return false;
		if (ch >= 'A' && ch <= 90)
			return true;
		return false;
	}
	
	int max(int i, int j) {
		int max = i;
		if (max < j) max =j; 
		return max;
	}
	
	int min(int i, int j) {
		int min = i;
		if (min > j) min =j; 
		return min;
	}
	
	String reverse(String s) {
		//return ( new StringBuffer(s) ).reverse().toString();
		StringBuffer ss = new StringBuffer(s);
		return ss.reverse().toString();
	}
	
	String toUpperString (String s) {
		s=s.toUpperCase();
		return s;
	}
	
	String toLowerString (String s) {
		s=s.toLowerCase();
		return s;
	}
}
