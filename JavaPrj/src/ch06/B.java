package ch06;

public class B 
        extends A{
   B(){
	   super("hello");
	   }
   B(String s){
	   super(s);
     this.s=s;
   }
   B(int a, String b){
	   super(a,b);}
   B(String a, String b, String c){super();}
}
