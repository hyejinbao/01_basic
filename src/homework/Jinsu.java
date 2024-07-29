package homework;

import java.util.Scanner;

public class Jinsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	int dec = 250; //10진수
	
	System.out.print("10진수 데이터 입력 = ");
	dec = scan.nextInt();
	
	
	
//	int bin = 11111010; // 2진수
//	
//	int oct = 372; //8진수
//	int hex = fa; //16진수
	
	String bin = Integer.toBinaryString(dec); //2진수 변환
	System.out.println("2진 수 =" + bin);
	
	String oct = Integer.toOctalString(dec); //8진수 변환
	System.out.println("8 진수 =" + oct);
	
	String hex = Integer.toHexString(dec); //16진수 변환
	System.out.println("16 진수 =" + hex);
	
	
	

	}

}
