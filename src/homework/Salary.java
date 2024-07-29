package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
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
        
        int sum = basePay + extraPay;
        double tax = (sum)*0.03;
		//int tax = sum *(003);
		double salary = sum - tax;
		
        
        //출력
		
	    System.out.println("*** " + name  + job + "월급 + ***");
		System.out.println("기본급 :" + new DecimalFormat().format(basePay) + "원");
		System.out.println("수당 :" + new DecimalFormat().format(extraPay) + "원");
		System.out.println("합계 :" + new DecimalFormat().format(sum) +"원");
		System.out.println("세금 :" + new DecimalFormat().format(tax) + "원");
		System.out.println("월급 :" + new DecimalFormat().format(salary)+ "원");
		
	
	}

}
