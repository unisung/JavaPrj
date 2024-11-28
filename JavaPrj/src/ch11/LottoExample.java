package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LottoExample {
	public static void main(String[] args) {
		//thread safe
		Set<Integer> set 
		= Collections.synchronizedSet(new HashSet<>());
		
		int cnt=0;
		while(set.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
			cnt++;
		}
		
		System.out.println(set);
		System.out.println("반복횟수:"+ cnt);
		
	}
}
