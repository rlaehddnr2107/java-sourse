package java01;

import java.util.Scanner;

public class J20210416_02_program {

	public static void main(String[] args) {
		// // 성적관리 프로그램
		Scanner sc = new Scanner(System.in);
		String[] sub = {"국어","영어","수학"}; 
		int[][] score = new int[2][3]; //점수배열
		while (true) {
			//타이틀
			System.out.println("-------------------------------");
			System.out.println("국제 성적 관리 프로그램 V1.0.0");
			System.out.println("-------------------------------");
			System.out.println("1.성적등록");
			System.out.println("2.학생별 합계/평균");
			System.out.println("3.과목별 합계/평균");
			System.out.println("9.종료");
			System.out.println("---------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:
				//점수입력받기
				for (int i=0; i<score.length; i++) {
					System.out.printf("[%d]번\n", i+1);
					
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%s?", sub[j]);
						score[i][j] = sc.nextInt();
					}
				}
				System.out.println("----------------------");	
				break;
			case 2:
				//학생별로 합계, 평균 출력
				System.out.println("-----------------");
				System.out.println("★★★학생별 출력★★★");
				System.out.println("-----------------");				
				for (int i=0; i<score.length; i++) {
					int sum=0;
					for(int j=0; j<score[i].length; j++) {
						//System.out.println(s);
						sum += score[i][j];
					}
					//합계
					System.out.printf("[%d]합계:%d 평균:%.2f\n",
							i+1,sum,(double)sum/score[i].length );
				}
				System.out.println("----------------------");		
				break;
			case 3:
				//과목별로 합계, 평균 출력
				System.out.println("-----------------");
				System.out.println("★★★과목별 출력★★★");
				System.out.println("-----------------");
				for(int j=0; j<score[0].length; j++) {
					int sum=0;
					for(int i=0; i<score.length; i++) {
						//System.out.println(score[i][j]);
						sum += score[i][j];
					}
					System.out.printf("[%s]합계:%d 평균:%.2f\n",
							sub[j],sum,(double)sum/score.length );
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				System.exit(0); //프로그램 종료
			default :
				System.out.println("잘못된 번호");
			}

			sc.nextLine(); //버퍼 비우기
			System.out.println("엔터를 누르세요");
			sc.nextLine(); //홀딩
		}
	}

}
