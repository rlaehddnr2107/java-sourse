package project;

import java.util.Scanner;



public class Projecttax {

//과세 표준금액
	//과세표준이란 세금을 부과하는 표준이 되는 금액으로, 이에 세율을 곱하면 산출 세액이
	//계산된다. 과세표준은 사업년도 소득에서 이월결손금, 소득공제, 비과세소득을 차감하여
	//계산한다.

	public static void main(String arg[]) {



		int income;

		int tax;



		Scanner scan = new Scanner(System.in);



		System.out.println("과세 표준 금액을 입력하세요");
		System.out.println("단위 : 만");
		income = scan.nextInt();

		if(income<1200)
			
			tax = (int) (income * 0.06);
		
		else if (income <= 4600) {

			tax = (int) (income * 0.15);

		} else if (income < 8800) {

			tax = (int) (income * 0.24);

		} else if (income < 15000) {

			tax = (int) (income * 0.35);
			
		} else if (income < 30000) {
			
			tax = (int) (income * 0.38);
			
		} else if (income < 50000) {
			
			tax = (int) (income * 0.40);

		} else {

			tax = (int) (income * 0.42);

		}

		System.out.println("납부하셔야 할 소득세는 " +tax+ " 만원 입니다");

	}

}