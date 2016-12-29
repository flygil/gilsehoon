package day07;

public class SingerTest {
	public static void main(String[] args) {
		Singer s1 = new Singer();
		/*
		 * private로 
		s1.name = "빅뱅";
		s1.age = 10;
		*/
		
		s1.setName("빅뱅");
		s1.setAge(10);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
