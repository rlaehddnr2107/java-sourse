package java01;

public class J20210412_03_operlater {

	public static void main(String[] args) {
		// 연산자
		// 삼항 연산자
//		int a = 10;
//		String s1=(a>0)?"양수":"음수";
//		System.out.println(s1);
		
		//실습 두수중에 큰수 찾아 출력
//		int a= 100, b=20;
//		int max = (a>b)?a:b;
//		System.out.println("큰값" + max);
		
		//세수중 가장 큰수 출력
		//int a= 100, b=20, c=500;
		//int s1 = (a>b)?a:b;
		//int s2 = (s1>c)?s1:c;
		//int max = a>b?(a>c)?a:c :(b>c)?b:c;
		
		//System.out.println("큰값은" +max);
		
		//실습 짝홀수 출력하기
//		int odd =11;
//		String s1 = (odd%2==0)?"짝수":"홀수";
//		System.out.println("이값은 "+ s1);
		
		//실습 세과목아 모두 60점이면 합격 아니면 불합격
		int kor=90,eng=70,math=50;
		String s =(kor>=60 && eng>=60 && math >=60)?"합격":"불합격";
		System.out.println(s);
		
		
	}

}
