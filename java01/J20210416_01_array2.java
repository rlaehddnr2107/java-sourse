package java01;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		// 2차 배열
//		int [][] arr = new int [][] {{1,2,3,4,},{5,6,7,8,},{9,10,11,12}};
//		int [][] arr = {{1,2,3,4,},{5,6,7,8,},{9,10,11,12}};
//		for (int i = 0 ;i<arr.length;i++) {
//			for (int j = 0 ;j<arr[i].length;j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		//for each
		//	for(int [] a :arr) {
		//		for (int b:a) {
		//		 System.out.println(b);
		//		}
		//		
		//	}
	
		//1~12대입 반복문을 이용해서 1안
//		int [][]arr = new int [3][4];
//		int no =0;
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = ++no
//				System.out.println(arr[i][j]);
//				
//			}
//		}
		//2안
//		int [][]arr = new int [3][4];
//		
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = (i*4)+(1+j);
//				
//				System.out.println(arr[i][j]);
//				
//			}
//		}
	//2명의 학생의 국영수 점수를 입력 받아 합계와 평균
//		String[]sub= {"국어","영어","수학"};
//		int [][]arr =new int[2][3];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i =0;i<arr.length;i++) {
//			System.out.printf("[%d]번\n",i+1);
//			
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf("%s? ",sub[j]);
//				arr[i][j]= sc.nextInt();
//				
//			}
//		}
//		System.out.println("==================================================");
//		
//		for(int[] std:arr) {
//			int sum=0;
//			for(int s : std) {
//				//System.out.println(s);
//				sum+=s;
//			}
//		//합계
//			System.out.println("합계" + sum);
//			System.out.println("평균"+(double)sum/3);
//		}
		//실습)국영수 평균 합계
//			Scanner sc = new Scanner(System.in);
//				String[] sub = {"국어","영어","수학"}; 
//				int[][] score = new int[2][3]; //점수배열
//				while(true) {
//				//타이틀
//				System.out.println("----------------------");
//				System.out.println("성적관리 프로그램 v1.0.0");
//				System.out.println("-----------------------");
//				System.out.println("1.성적 등록");
//				System.out.println("2.학생별 합계  평균");
//				System.out.println("3.과목별 합계 평균");
//				System.out.println("-----------------------");
//				System.out.println("위 번호중 원하시는 번호를 입력하시오");
//				int no = sc.nextInt();
//				
//				if (no==1) {	for (int i=0; i<score.length; i++) {
//					System.out.printf("[%d]번\n", i+1);
//					
//					for(int j=0; j<score[i].length; j++) {
//						System.out.printf("%s?", sub[j]);
//						score[i][j] = sc.nextInt();
//					}
//				}
//				System.out.println("----------------------");}
//				else if (no==2) {	for (int i=0; i<score.length; i++) {
//					int sum=0;
//					for(int j=0; j<score[i].length; j++) {
//						//System.out.println(s);
//						sum += score[i][j];
//					}
//					//합계
//					System.out.printf("[%d]합계:%d 평균:%.2f\n",
//							i+1,sum,(double)sum/score[i].length );
//				}
//				System.out.println("----------------------");}
//				else if (no==3) {			for(int j=0; j<score[0].length; j++) {
//					int sum=0;
//					for(int i=0; i<score.length; i++) {
//						//System.out.println(score[i][j]);
//						sum += score[i][j];
//					}
//					System.out.printf("[%s]합계:%d 평균:%.2f\n",
//							sub[j],sum,(double)sum/score.length );
//					System.out.println("-------------------");
//				}}
//				else {
//					System.out.println("잘못입력하셨습니다");
//				}
//				}
				//점수입력받기
				
				
				//학생별로 합계, 평균 출력

				//과목별로 합계, 평균 출력

	}
}
