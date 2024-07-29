package basic;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = 25 > 26; //형식
		System.out.println(a);
	
		char b = 'A'; 
		System.out.println(b);
		char c = 97;
		System.out.println(c); //투숙객 손님을 문자로 취급 2진수이지만 char를 써서 10진수로 표현
	
		//바이트 실습
		byte d = 125;
		System.out.println(d);	
		
		// int 실습
		int e = 12348978;
		System.out.println(e);
		
		//string a = 'A';
		
		
		int f = 'A';
		System.out.println(f);
		
		long g = 25L; // long형 상수 
		System.out.println(g);
		
		//float h = 43.8f; // float형 상수로 뒤에 f, 또는 F 붙여준다.
		float h = (float)43.8; //강제형변환 
		System.out.println(h);  
	
	}

}
