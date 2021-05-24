package project;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
	// 1.테슬라모델 3
	// 2.테슬라모델 s
	// 3.테슬라모델 3 + 자율주행
	// 4.테슬라모델 s + 자율주행
	// 5.테슬라모델 3 + 자율주행 +19인치 휠
	// 6.테슬라모델 s + 자율주행 +19인치 휠
		Scanner sc = new Scanner(System.in);
		TeslaDAO tdao = new TeslaDAOImpl();
		System.out.println("____*******____*****____ ****____*___________*___________");
		System.out.println("_______*_______*________*________*__________*_*__________");
		System.out.println("_______*_______*****_____***_____*_________*_*_*_________");
		System.out.println("_______*_______*____________*____*_________*___*_________");
		System.out.println("_______*_______*****____****_____*****____*_____*_______*");
	

		
		
		
		int no = 0;
		while(no != 4) {
			System.out.println("가격을 볼 견적서를 고르세요");
			System.out.println("1번 선택후 2번,3번의견적을 뽑아주세요");
			System.out.println("1.테슬라모델 3");
			 System.out.println("2.테슬라모델 3 + 자율주행");
			 System.out.println("3.테슬라모델 3 + 자율주행 +19인치 휠");
			 System.out.println("4.종료 버튼");
			 no = sc.nextInt();
			if (no==1) {
				TeslaDTO tdto = new TeslaDTO("LONG RANGE : 59,990,000원");
				int cnt = tdao.insert(tdto);
				System.out.println(cnt +"건 추가");	
				continue;
			}else if(no==2) {
				TeslaDTO tdto = new TeslaDTO("자율주행 기능 추가시 :69,033,000원");
				int cnt = tdao.update(tdto);
				System.out.println(cnt +"건 확인 바람");
				continue;
			}else if (no==3) {
				TeslaDTO tdto = new TeslaDTO("자율주행 +19인치 휠 :70,962,000원");
				int cnt = tdao.update(tdto);
				System.out.println(cnt +"건 확인 바람");
				continue;
			}else if (no==4)
				System.out.println("종료합니다");
				System.out.println("방문해주셔서 감사합니다");
		}
	}

}
