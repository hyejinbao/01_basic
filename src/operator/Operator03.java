package operator;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; 
		a += 2; // a = a+2
		a *= 3; // a = a*3 덮어쓴다. 
		System.out.println("a = " + a);
		
		a += 1; 
		System.out.println("a = "+ a);
		
		int b = a++; //후행연산(나중에 처리한다) 
		System.out.println("b = " +b +"a = "+ a); // ++보다 = 이 더 먼저 인식된다(후행연산때문에) 
		
		int c = ++a - b--; // 후행연산으로 b 뒤에 -- 적용안됨
		System.out.println(c);  //a는 24 b= 2 c는 2 
		
		
		System.out.println("a++ ="  + a++);
		System.out.println("a ="  + a);
		
		
		
	}

}
