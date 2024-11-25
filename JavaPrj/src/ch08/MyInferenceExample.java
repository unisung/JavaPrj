package ch08;

import java.util.ArrayList;
import java.util.List;
//타입추론 :  변수 = 타입
public class MyInferenceExample {
	public static void main(String[] args) {
	 //변수 선언(추론) - 반드시 초기화 필요
	 //myVar는 오른쪽의 "hello,Java!"문자열을 보고 타입결정(String)	
		var myVar = "hello, Java!";
	 //초기화 하지 않으면 오류발생
	 //  var unInitializedVar;
		
	var x = 10;
	x=20;
	//두번 선언해서 오류발생
	//var x = "Hello";
		
	var  myList = new ArrayList<String>();	
	myList.add("hello");
	myList.add("hi!");
	myList.add("bye");
	//향상된 for문
	for(String s:myList) {
		System.out.println(s);
	}
	
	//제내릭에서 타입 추론 전
	List<String> mylist2 = new ArrayList<String>();
	//타입추론 후
	List<String> mylist3 = new ArrayList<>();
	

	}
}
