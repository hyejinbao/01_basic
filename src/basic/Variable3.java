package basic;

import java.util.Random;
public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = Math.max(25,36);
		System.out.println("큰 값= " + big);
		
		// 12.7 과 78.5 작은 값을 구하시오 
		double small = Math.min(12.7, 78.5);
		System.out.println("작은 값 =" + small);
		
		// 2의 5승
		double power = Math.pow(2.0, 5); //승 math
		System.out.println("2의 5승 =" + power);
		
		// 난수 - 컴퓨터가 불규칙하게 발생하는 수 
		// 0<= 난수 < 1
		double a = Math.random();
		int c = (int)(a*100); // 0 ~ 99
		int d = (int)(Math.random() * (90-65+1) + 65); //x~y 사이의 난수 발생
		char e =(char)(Math.random() * (90-65+1) + 65); // 65~90 사이의 난수를 출력 (알파벳) 
		
	    System.out.println();
		
		System.out.println(a);
		System.out.println((int)(c));
		System.out.println(d); // 65
		System.out.println(e); // 65
		
		// a에서 2자리만 출력 int c =; 
		
		double b = new Random().nextDouble();
		System.out.println(b);
		
		
	}

}
