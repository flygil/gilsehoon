package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Test03 {
/*
	public static Map<String, Character> randomMap() {
		Map<String, Character> map = new HashMap<>();
		Random r = new Random();
		String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 10; i++) {
			int keyNum = r.nextInt(52);
			map.put(String.valueOf(keyNum), alpha.charAt(keyNum));
		}
		return map;
	}
	
	public static void main(String[] args) {
		Map<String, Character> map = randomMap();
		System.out.println(map);
		
		Set<String> keys= map.keySet();
		
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		Set<Entry<String, Character>> entrySet = map.entrySet();
		for( Entry<String, Character> entry : entrySet ) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
*/		
	/*
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "이재명");
		map.put("name", "표창원");
		map.put("addr", "국회의사당");
		map.put("homepage", "nabo@ass.com");
		
		System.out.println(map);
	
	
		
		System.out.println(map);
		
		//map.get(key값) 으로 값가져오기
		String name = map.get("name");
		System.out.println(name);
		
		System.out.println(map.get("age"));
		
		//map.remove(key값) 키값으로 삭제하기
		//remove시에 삭제한값을 반환한다.
		Map<String, String> temp = new HashMap<>();
		temp.put("name", map.remove("name"));
				
		//temp.put("name", map.get("name"));
		//map.remove("name");
		
		String rName = map.remove("name");
		System.out.println("삭제된값 : " + rName);
		
		
	}*/
}
