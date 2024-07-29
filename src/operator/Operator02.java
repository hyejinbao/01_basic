package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  //class에 스캐너라는 주소 / scan이라는 변수(객체)
		
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		String result = score >= 80 && score <100 ? "합격" : "불합격" ; // result로 들어가던가
		System.out.println(result);
	
		
		//int score = 80;
		
	}

}
