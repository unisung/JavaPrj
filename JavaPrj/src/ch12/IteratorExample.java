package ch12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
	public static void main(String[] args) {
     Set<String> set = new HashSet<>();
     set.add("홍길동");
     set.add("일지매");
     set.add("임꺽정");
     set.add("이순신");
     
     System.out.println(set);
     
     Iterator<String> itor = set.iterator();
     
     int cnt=0;
     
     while(itor.hasNext()) {//반복객체에  값이 있으면
    	 String s = itor.next();//반복객체에서 값을 가져옴
    	 if(s.equals("일지매")) {
    		 System.out.println(s);
    		 System.out.println(cnt);
    	 }
    	 cnt++;
     }

	}
}
