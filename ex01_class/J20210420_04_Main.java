package ex01_class;

public class J20210420_04_Main {

	public static void main(String[] args) {
//		System.out.println(args);
//		for(String s:args) {
//			System.out.println(s);
//		}

		
		//실습 id와 pw를 아규먼트로 받아서
		//만약 id가 java이고 pw가 1111이면 관리자 모드 아니면 일반 사용자 모드출력
		if (args.length>1 && args[0].equals("java")&&args[1].equals("1111")) {
			System.out.println("관리자 모드입니다");
		}else
			System.out.println("일반 사용자 모드입니다");
		
	}

}
