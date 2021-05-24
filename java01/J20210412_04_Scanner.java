package java01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		// 사용자에게 입력 받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하시오" );
//		int a = sc. nextInt();
//		System.out.println("입력받은 값은 : " +a);
	
		//반지름을 입력 받아 원의 넓이 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반지름을 입력하시오");
//		double a = sc. nextDouble();
//		//Math PI : 원주율
//		System.out.println("값은 입니다" +(a*a*Math.PI));
		
		//문자열 입력 받기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름은?");
//		String na = sc.next();
//		System.out.println("당신의 이름은 " +na);
		  
		// 한 줄을 읽어드리는 메소드(엔터를 기준으로)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름은?");
//		String  name=sc.nextLine();
//		System.out.println("이름은" +name);
	
		//실습 나이와 메일 이름을 입력 받아 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		System.out.print("이메일은?");
//		String email = sc.next(); //문자열 (공백,엔터 기준)
//		sc.nextLine();//엔터처리 (버퍼를 비우기 위해서)
//		System.out.print("이름은?");
//		String name = sc.nextLine();
//		
//		System.out.println(age + " "+ email + " " + name);

		//실습 반과 이름 국 영 수 점수를 입력 받아 
		//총점과 평균을 구하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("몇반? 이름은?");
		int a = sc.nextInt();
		String b = sc.nextLine();
		System.out.println("국어, 영어, 수학");
		int kor =sc.nextInt();	
		int eng =sc.nextInt();	
		int mat =sc.nextInt();	
		int sum = kor + eng+ mat;
		double avg = (double)sum/3;
		System.out.println(b+"님의 총점은 : "+sum);
		System.out.println(avg *100);
		System.out.println(Math.round(avg *100));
		System.out.println((double)Math.round(avg *100)/100);
		
		//format 메소드 이용
		System.out.println("포멧메소드" +String.format("%.2f", avg));
		
	}

}
