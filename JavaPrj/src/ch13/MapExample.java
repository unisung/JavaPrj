package ch13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
	Map<String, String> map 
	        = new HashMap<String, String>();
	
	map.put("apple", "사과");
	map.put("banana", "바나나");
	map.put("baby", "아기");
	map.put("love", "사랑");
	
	//객체 하나 추출
	String kr= map.get("banana");
	System.out.println(kr);
	
	//키가 저장되어있는지 확인 
	boolean exists = map.containsKey("banana");
	System.out.println(exists);
	//값이 저장되어있는지 확인
	boolean exists2 = map.containsValue("사과");
	System.out.println(exists2);
	
	//저장된 갯수
	System.out.println(map.size());
	
	//삭제
	String key = map.remove("love");//삭제된 value가 출력됨.
	System.out.println(key);
    
	
	
	
	

	}
}
