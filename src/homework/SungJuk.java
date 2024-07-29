package homework;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char name = 'L';
		
		int kor = 85;
		int eng = 90;
		int math = 100;
		
		System.out.println("*** L 성적표 ***");
		//System.out.println("국어 영어 수학 총점 평균");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		int tot = kor + eng + math;
		System.out.print("총점 =\n" + tot);
		System.out.println();

		double avg = (double)(kor + eng + math) / 3;  //강제형변환 
		//System.out.println(avg);
		System.out.print("평균 =\n" + String.format("%.3f", (avg)));
		// String avg = String.format("%.3f", (double)tot / 3); //강제형변환하고 앞에는 스트링으로 선언해줘야한다. 
		
		
	}

}
