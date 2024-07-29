package basic;

public class Variable2 {
	int a; // 클래스소속(필드) 메모리 , 자바에서는 필드 , 파이썬 에서는 전역변수 // 김천가서 주문 
	static int b;  // 자바가 실행함과 동시에 미리 만들어놓음 // 파바 가서 주문
	static String c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100; // local variable 지역변수 , 쓰레기값이 존재해서 초기화 해야한다. 
		System.out.println(a); // int a; --  메인함수 메모리 위치
		
		System.out.println("필드 =" + b);
		System.out.println("필드 =" + a); //메인함수 안에 a가 출력된다 
		System.out.println("필드 =" + new Variable2().a);  // new를 생성해본다. 
		c ="apple";  //리터널 생성
		System.out.println("필드 c=" + c); //변수를 선언하고 모든 명령어는 함수 안에 써야한다 
		
	}

}
