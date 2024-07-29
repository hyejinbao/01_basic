package operator;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a = 16;  //int 4비트 
	 
	 System.out.println("+16 =" + a);
	 System.out.println("+16 =" + Integer.toBinaryString(a)); //4비트여서 0000이 4개 나온다.
	 
	 
	 
	 //음수 표현 앞에가 부호비트고 뒤집어놓은다 . 
	 System.out.println("+16 =" + a);
	 System.out.println("+16 =" + ~a); //1의 보수 
	 System.out.println("+16 =" + Integer.toBinaryString(~a)); //4비트여서 0000이 4개 나온다.
	 System.out.println("+16 =" + (~a+1)); //2의 보수는 음수로 표현이 된다.  
	 
	 
	 System.out.println("+16 =" + (~a+1));
	 System.out.println("+16 =" + Integer.toBinaryString(~a+1)); //4비트여서 0000이 4개 나온다.
	}

}
