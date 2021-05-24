import java.util.Scanner;

public class J20210413_05_if {

	public static void main(String[] args) {
		// if 문
		//전기 사용 요금 계산
//		double won = 0;
//		int use = 450; //사용량
//		double ele1 = 88.3;//1단계 전력량 요금
//		double ele2 = 182.9;//2단계 전력량 요금
//		double ele3 = 275.6;//3단계 전력량 요금
//		int base;//기본 요금
//		
//		if (use<=200) { //1단계
//			base = 910;
//			won = base + use * ele1;
//		}
//		else if (use<=400) {//2단계
//			base= 1600;
//			won =base + (200 *ele1) + ((use -200) + ele2);
//		
//		}else {// 3단계
//			base= 7300;
//			won = base + (200* ele1) + (200* ele2) + ((use-400)* ele3);
//		
//		}
//		System.out.println(won);
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		
//		
//		System.out.println("사용요금" + (int)won);
		
		//무작위의 수
		// 0 <= random <=1
		//((int)(마지막 - 시작값 + 1) +시작값)
//		double a = Math.random();
//		System.out.println(a);
//		System.out.println((int)(a*6+1)+1); //1부터 6까지의 수
//		System.out.println((int)(a*(10-5+1)+5));// 5부터 10까지의 수
//		System.out.println((int)(a*(20-11+1)+11)); //11~20까지의 수

		
		//주사위 게임
		int a = (int)(Math.random() * 6 + 1 + 1);
		int b = (int)(Math.random() * 6 + 1 + 1);
		System.out.println(a);
		System.out.println(b);
		
		 if (a>b)
			 System.out.println("a승");
		 else if(a<b)
		 	System.out.println("b승");
		 else
			 System.out.println("비겼습니다");
		
		
	}

}
