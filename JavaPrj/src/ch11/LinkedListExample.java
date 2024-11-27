package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		//요소 (삽입)
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		
		//리스트에 들어있는 모든 요소를 배열로 추출
		Object[] arr =a.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//arrayList내에 특정객체의 저장위치 찾을때 indexOf()
		int idx = a.indexOf("Java");
		System.out.println(idx);	
		//
		ArrayList<String> b = new ArrayList<String>();
		b.add("apple");
		b.add("banana");
		b.add("cherry");
		
		//리스트 a뒤에 리스트b의 요소들을 append -  a.addAll(b)
		a.addAll(b);
		//출력
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a.size());
		//다른 요소로 (수정)
		a.add(2,"Sahni");
		System.out.println(a.size());
		//size()값보다 큰 인덱스를 사용하여 삽입시 오류발생
		//a.add(5,"kim");
		
		//요소알아내기(조회) - get(인덱스번호))
		String str = a.get(1);
		System.out.println(str);
		
		//특정객체가 리스트안에 존재하는지 여부확인
		boolean isExists = a.contains("Java");
		System.out.println(isExists?"있음":"없음");
		
		//요소삭제 - remove(인덱스번호)
		String s = a.remove(1);
		System.out.println(s);
		
		//현재객체의 수
		System.out.println(a.size());
		
		//전체 삭제 -clear()
		a.clear();
		
		//현재객체의 수
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
	}

}
