package java01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		// for문
		//소수 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int b = sc.nextInt();
//		int i;
//				
//		for(i =2;i<b;i++) {
//			if (b%i==0) {
//				System.out.println("소수가 아닙니다.");
//				break;
//			}
//				
//		}
//		if(i==5) 
//			System.out.println("소수입니다");
		
		//1~100까지 수중 소수 구하기
	
		boolean b;
	
		int i;
		
		
		for (int j=2 ;j<101;j++ ) {
			b=true;
			for (i=2;i<j;i++) {
				if (j%i==0) {
					System.out.println(j);
				b=false;
				break;
			}
			
		}
			if (b) {
				System.out.println(j);
			}
			
		}
		
		
				
		
	}

}
