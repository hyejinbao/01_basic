package basic;

//기본패키지가 java.lang이기 때문의 아래 문장은 쓸 필요가 없다. 
import java.text.DecimalFormat;


public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	short a = 320;
	short b = 258;
	
	int sum = a + b ; 
	System.out.println(a + "+" + b + "=" + sum );
	
	int sub = a - b ;
	System.out.println(a + "-" + b + "=" + sub );
	
	int mul = a * b ;
	System.out.println(a + "*" + b + "=" + mul ); 
	System.out.println(a + "*" + b + "=" + new DecimalFormat().format(mul)); //3자리마다 ,  표시하는 함수 
	
	double div = (double) a/b; //정수형에서정수형 나누기 정수형  a는 강제형변환 / b 는 자동형변환
	System.out.println(a + "/" + b + "=" + div);
	System.out.println(a + "/" + b + "=" + String.format("%.2f", (div))); //소수 2째자리
	
	}

}
