package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		//중복을 허용하지 않는다.
		set.add("two");
		System.out.println(set);
		
		System.out.println(set.add("five"));
		System.out.println(set.add("six"));
		System.out.println(set.add("seven"));
		
		System.out.println(set.add("five"));
		System.out.println(set);
		System.out.println(set.size());
		
		//set.remove
		set.remove("one");
		System.out.println(set);
		
		//사용불가능 : index 접근불가
		//for(int i = 0; i < set.size(); i++)
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		for (String s : set) {
			System.out.println(s);
		}
	}
}

