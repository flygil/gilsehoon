package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		//리스트의 데이터 확인하기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		for (String s : list) {
			System.out.println(s);
			
		}
		
		/*
		//get(int index)
		System.out.println(list.get(1));
		
		//삭제 remove(int index);
		list.remove(0);
		System.out.println(list.get(1));
		//삭제 remove(Object o) /toString오버라이딩
		list.remove("three");
		System.out.println(list);
		//추가 -인덱스지정추가, 오브젝트형태 추가
		list.add(0,"one");
		list.add("three");
		System.out.println(list);
		//모두삭제
		list.clear();
		System.out.println(list);
		
		list.add("one");
		
		//addAll sub를 list에 모두 복사
		List<String> sub = new ArrayList<>();
		sub.add("two");
		sub.add("three");
		list.addAll(sub);
		System.out.println(list);
		
		//isEmpty()
		System.out.println(list.isEmpty());
		
		//contains()
		System.out.println(list.contains("one"));
		System.out.println(list.indexOf("one"));
		System.out.println(list.indexOf("four"));
		*/
	}
}
