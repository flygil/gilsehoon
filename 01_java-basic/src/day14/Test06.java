package day14;


public class Test06 {
	public static void main(String[] args) {
		
		Box01 b = new Box01();
		b.setData("test");
		String data = b.getData();
		System.out.println(data);
		
		Box01 b2 = new Box01();
		b2.setData("test");
		String data2 = b2.getData();
		System.out.println(data2);
		
		

		Box03<String> b3 = new Box03<String>();
		b3.setData("test");
		String data4 = b3.getData();
		System.out.println(data4);
		
//		Box04<String, String> b4 = 
//				new Box04<String, String>("apple","사과");

		//		1.7부터 다이아몬든선언법 가능
		Box04<String, String> b4 = 
				new Box04<>("apple","사과");
		System.out.println(b4.getKey());
		System.out.println(b4.getValue());
	}
}
