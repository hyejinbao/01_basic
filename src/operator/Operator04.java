package operator;

public class Operator04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =0, num2 =0;
		boolean result; 
		
		result = ((num1 +=10) < 0  && (num2 +=10) > 0); // 이미 앞에 가 false 므로 10이 0보다 작지 않아서 옆에가 수행이 안된다 즉 0
		System.out.println(result);
		System.out.println("num1 = " + num1+  " num2 = "+ num2);
		
		result = ((num1 +=10) > 0  || (num2 +=10) > 0); // 이미 앞에 가 false 므로 10이 0보다 작지 않아서 옆에가 수행이 안된다 즉 0
		System.out.println(result);
		System.out.println("num1 = " + num1+  " num2 = "+ num2);
	
	}

}
