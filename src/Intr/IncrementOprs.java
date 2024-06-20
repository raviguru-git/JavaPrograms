package Intr;

public class IncrementOprs {
	public static void main(String[] args) {
		//int a=11; // 1st instance a=11;a =12; + ++a (13) 11+13 = 24;
		//System.out.println(a++ + ++a);
		int a =3; int b= 5;
		b = --b - a++ + ++b - --a;
		System.out.println(b);
		
		int i=1, j=2, k=3;
		int m = i-- - j--  - k--;
		System.out.println("m value" + m);
		
	}
	

}
