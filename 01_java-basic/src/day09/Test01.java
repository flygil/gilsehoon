package day09;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(1);
		
		Dog d = new Dog();
		d.setName("로뎅");
		d.setAge(8);
		System.out.println(d.getName() + " " +d.getAge());
		 
		
		Dog d2 = new Dog("로뎅", 8);
		System.out.println(d2.getName() + " " +d2.getAge());
	}
}
