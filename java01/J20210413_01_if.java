package java01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문 : if문                            
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두수를 입력하시오");
//		int a= sc.nextInt();
//		int b= sc.nextInt();
//		
//		
//		
//		if(a>b) {
//			System.out.println(a);
//			System.out.println("a가 더큽니다");
//		}		
//		else {
//			System.out.println(b);
//			System.out.println("b가 더큽니다");
//		}	
		
		//실습 점수를 입력 받고 입력 받은 점수에 따라 등급을
		//출력(절대평가)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요");
//		int so = sc.nextInt();
//		if(so>=90)
//			System.out.println("A등급입니다");
//		else if (so>=80)
//			System.out.println("B등급입니다");
//		else if (so>=70)
//			System.out.println("C등급입니다");
//		else if (so>=60)
//			System.out.println("D등급입니다");
//		else 
//			System.out.println("F등급입니다");
		
		//등수와 인원수를 입력 받아
//		Scanner sc = new Scanner(System.in);
//		System.out.println("등수 인원수를 입력하시오");
//		int g = sc.nextInt();
//		int t = sc.nextInt();
//		
//		if (g<=t* 0.15)
//			System.out.println("A학점입니다.");
//		else if (g<=t* 0.35)
//			System.out.println("B학점입니다");
//		else if (g<=t* 0.50)
//			System.out.println("C학점입니다");
//		else 
//			System.out.println("D학점 입니다");
		
		//섭씨는 화씨로 화씨는 섭씨로
//		Scanner sc = new Scanner(System.in);
//		System.out.println("온도를 입력하고 기호를 입력하시오");
//		int on = sc.nextInt();
//		String gi = sc.next();
//		
//		//문자열 비교시 equals 메소드를 이용하여 비교
//		if (gi.equals("c"))
//			System.out.println("섭씨를 화씨로 변환한값은 : "+ ( on * (double)9/5 + 32));
//		else if (gi.equals("f"))
//			System.out.println("화씨를 섭씨로 변환한값은 : "+ (on - 32) * (double)5 /9);
//		else 
//			System.out.println("다시 입력하세요");
		
		//사칙연산 계산
		//10+20 =
//		try {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자와 기호를 입력하고 마지막으로 숫자를 입력하시오");
//		int a = sc.nextInt();
//		String b = sc.next();
//		int c = sc.nextInt();
//		
//		if (b.equals("+"))
//			System.out.println(a + "+" +c + "=" + (a+c));
//		else if (b.equals("-"))		
//			System.out.println(a + "-" +c + "=" + (a-c));
//		else if (b.equals("*"))
//			System.out.println(a + "*" +c + "=" + (a*c));
//		else if (b.equals("/"))
//			System.out.println(a + "/" +c + "=" + (double)a/c);
//		else 
//			System.out.println("잘못된 값입니다.");
//		
//		}catch (InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요");
//		}catch(Exception e) {
//			System.out.println("예외 발생");
//		}
		
		//계산기 2 입력 값 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자값");
//		System.out.println("숫자?" + sc.hasNextInt());
//		
//		//코드 인스펙션 : 규율 == ture,false로 비교하지 않는다
//		if (!sc.hasNextInt()) {//숫자가 아니라면
//			
//			System.out.println("잘못된 숫자");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}	
				
		//아이디와 패스워드를 입력 받아 로그인 성공 여부를 결정짓는 프로그램	
//		String myid = "java";
//		String mypw = "1111";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력해주세요");
//		String id = sc.next();
//		
//		if (id.equals(myid)) {
//			System.out.print("비밀번호를 입력해주세요");
//			String pw = sc.next();
//			if (pw.equals(mypw))
//				System.out.println("접속 성공");
//			else
//				System.out.println("비밀번호 불일치");
//		}
//				
//		else 
//			System.out.println("아이디가 일치하지 않습니다.");
		
		//년을 입력 받고 윤년 체크하기
//		Scanner sc= new Scanner(System.in);
//		System.out.println("년도를 입력하세요");
//		int a = sc.nextInt();
//		if ((a%4 ==0 && a%100 != 0)||a%400 ==0)
//			System.out.println(a + " 년은(는) 윤년입니다.");
//		
//		else
//			System.out.println("윤년이 아닙니다.");
		
		//전기 사용 요금
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사용량을 입력하시오");
//		int khw = sc.nextInt();
//		
//		if (khw<200) 
//			System.out.println("전기요금은 : " + (840+(khw*93.3)));
//		else if(khw<400)
//			System.out.println("전기요금은 : " + (1600+(khw*187.9)));
//		else if(khw>400)
//			System.out.println("전기요금은 : " + (7300+(khw*280.6)));
		
		//메뉴 선택
//		System.out.println("1.자장면 2.짬뽕 3.설렁탕 4.비빔밥 5.피자 6.스파게티");
//		System.out.println("----------------------------------------------------");
//		Scanner sc =new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		if (a.equals("1" || "2"))
//			System.out.println("중식 코너로 가시오");
//		else if (a.equals("3" || "4"))
//			System.out.println("한식 코너로 가시오");
//		else if (a.equals("5" || "6"))
//			System.out.println("양식 코너로 가시오");		
		
	}

}
