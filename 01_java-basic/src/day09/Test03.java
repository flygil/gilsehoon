package day09;

class Sub03{
	static int count = 0;
}


public class Test03 {
	int i = 100;
	static int k = 100;
	
	public void call(){
		//System.out.println(i);
		//System.out.println(k);
		Sub03 sub = new Sub03();
		System.out.println(sub.count);
		sub.count = 100;
		System.out.println(Sub03.count);
		Sub03.count = 200;
		System.out.println(sub.count);
		
	}
	
	public static void main(String[] args) {
		/*
		 * static 영역에서 non-static(instance) 영역의 변수 또는 메서드를 직접
		 * 접근할 수 없다.
		 * System.out.println(i);
		 * call();
		 */
		Test03 t03 = new Test03();
		t03.call();
		//System.out.println(t03.i);
	}
}
