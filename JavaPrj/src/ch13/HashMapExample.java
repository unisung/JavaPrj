package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScores=
				new HashMap<String, Integer>();
		
		//점수 저장
		javaScores.put("홍길동", 97);
		javaScores.put("일지매", 88);
		javaScores.put("임꺽정", 98);
		javaScores.put("이순신", 70);
		javaScores.put("김길동", 99);
		
		//전체 갯수
		System.out.println(javaScores.size());
		
		//키들만 뽑기
		Set<String> keys=javaScores.keySet();
		
		//iterator생성
		Iterator<String> itor = keys.iterator();
		while(itor.hasNext()) {
			String key=itor.next();
			int score = javaScores.get(key);
			System.out.println(key +":" + score);
		}
	}
}
