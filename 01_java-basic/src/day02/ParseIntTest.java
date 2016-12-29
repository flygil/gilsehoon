package day02;

public class ParseIntTest {
	public static void main(String[] args) {
		System.out.println( Integer.parseInt(args[0]) + Integer.parseInt(args[1]) );

	int args0 = Integer.parseInt(args[0]);
	int args1 = Integer.parseInt(args[1]);
//두수의 합 : 300
	System.out.println( "두수의 합 : " + (args0 + args1) );
	
	//100 + 200 = 300
	System.out.println( args0 + " + " + args1 + " = " + (args0 + args1) );
	System.out.printf("%d + %d = %d", args0, args1, (args0 + args1) );
	
	}

}

