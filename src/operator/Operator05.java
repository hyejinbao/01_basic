package operator;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = 25 > 26;
		System.out.println("!a = "+ !a);
		System.out.println();
		
		String b = "apple"; // 여기서 b는 객체다(100번지) - 클노4 "apple"을 주는게 아니다 "apple"있는 주소를 줌
		String c = "apple"; // 현재 메모리는 b에서 잡혀있어서 똑같이 문자열을 잡지 않는다. 
		String d = new String("apple"); //new라는 연산자는 계속 만들어버린다 string 안에 apple 계속 잡는다. d (500번지)

		//주소를 비교하는것
		System.out.println("b == c :" +(b ==c ? "같다" : "다르다" ));
//		System.out.println("b == c :" +(b ==c ? "같다" : "다르다" ));
	//	System.out.println("b == c :" +(b ==c ? "같다" : "다르다" ));
		System.out.println("b == d :" +(b ==d ? "같다" : "다르다" ));
				
				
	  //문자열 비교 equals
		System.out.println();
		System.out.println("b.equlals(c) :" +(b.equals(c)? "같다" : "다르다" ));
		System.out.println("b.equlals(d) :" +(b.equals(d)? "같다" : "다르다" ));

		System.out.println();
		System.out.println("!b.equlals(c) :" +(!b.equals(c)? "같다" : "다르다" ));
		System.out.println("!b.equlals(d) :" +(!b.equals(d)? "같다" : "다르다" ));

	}

}
