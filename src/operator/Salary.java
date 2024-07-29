package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//합계가 5,000,000원 이상이면 3% (0.03)
	    //  3,000,000원 이상이면 2% (0.02)
	    //  아니면 1% (0.01)
		// 조건 세율 - 조건연산자 
		//String name = "홍길동";
		//int basePay = 4900000;
		//int extraPay =200000;
	//	double salary = 0;
		
		//입력 
		
	    System.out.print("이름 입력 : ");
        String name = scan.next();
        
	    System.out.print("직급 입력 : ");
        String job = scan.next();  //job으로 수정
        
        System.out.print("기본급 입력 : ");
        int basePay = scan.nextInt();
        
        System.out.print("수당 입력 : ");
        int extraPay = scan.nextInt();
        
        //계산
        
        int tot = basePay + extraPay; //합계
      //  double rate = 0.03;
        double rate = tot >=5000000 ? 0.03 : tot >= 3000000 ? 0.02 : 0.01;
        int tax = (int)(tot * rate);
		//int tax = sum *(003);
		int salary = tot - tax;
		
		//double rate = tot >=500000 ? 0.03 : tot > 3000000 ? 0.02 : 0.01;
        
        //출력
		
	    System.out.println("*** " + name  + job + "월급 + ***");
		System.out.println("기본급 :" + new DecimalFormat().format(basePay) + "원");
		System.out.println("수당 :" + new DecimalFormat().format(extraPay) + "원");
		System.out.println("합계 :" + new DecimalFormat().format(tot) +"원");
		System.out.println("세금 :" + new DecimalFormat().format(tax) + "원");
		System.out.println("월급 :" + new DecimalFormat().format(salary)+ "원");
		
	//	boolean result;
		//result = tot >= 5000000 && tot >= 3000000 ? tot* 0.03 : tot* 0.02;
 		//double rate = tot >=500000 ? 0.03 : tot > 3000000 ? 0.02 : 0.01;
		//System.out.println(result);
	}

}
