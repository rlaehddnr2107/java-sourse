package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args) {
		//예외 처리 
		//JVM이 해당하는 객체를 처리
//		Scanner sc = new Scanner (System.in);
//		
//		
//		int a =10;
//		int b = 0;
//
//	//	b = sc.nextInt();
//	//	System.out.println(a/b);
//		while (true) {
//			System.out.println("나눌수를 입력하시오");
//			try {//예외발생 가능성 문자
//				b = sc.nextInt();
//				System.out.println(a/b);
//				break;
//			
//			}catch(InputMismatchException e) {//숫자를 입력하지 않았을때
//				System.out.println("숫자를 입력하세요");
//				sc.nextLine();//버퍼 비우기 
//				e.printStackTrace(); //예외 발생된 지점 출력
//			}catch(ArithmeticException e) {//0으로 나눌수 없다는 예외
//				System.out.println("0으로 나눌수 없습니다.");
//				e.printStackTrace();//예외 발생된 지점 출력
//			}catch(Exception e) {//모든 예외 처리 : 마지막에 처리
//				System.out.println("숫자를 입력하시오");
//				e.printStackTrace();//예외 발생된 지점 출력
//		}
//	
//	}
//		System.out.println("프로그램 종료");
		//실습)
//		int[] arr = {10,20,30};
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("보고싶은 번호를 선택하시오");
//			int a = sc.nextInt();
//			System.out.println(arr[a-1]);
//		}catch (InputMismatchException e) {
//			System.out.println("정수를 입력하시오");
//			e.printStackTrace();
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("1~3까지의 수를 입력하시오");
//		} catch (Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
		//예외의 종류
		// 1 체크예외 : RumtimeException을 상속하지 않은 예외
		//네트워크나 db나 파일등 외부와 연결되는 것들
		// 2 언체크 예외 : RumtimeException을 상속한 예외
		File f = new File("sample.txt");
		System.out.println(f);
		try {
			Scanner sc = new Scanner(f);
			System.out.println("파일을 읽기 성공");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {//체크예외
			System.out.println("파일이 존재하지 않습니다");
			e.printStackTrace();
		}
		
	}

}
