package ex01_class;

import java.util.Arrays;

class Sum{
	//두정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b) {
		return a+b;
	}
	//세정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a,int b, int c) {
		return a+b+c;
	}
	
	//배열을 매개변수로 받아서 합을 마지막 index에 넣고리턴하는 메소드
	int add(int[] arr) {
		//System.out.println(Arrays.toString(arr));
		int sum =0;
		for(int i=0; i< arr.length-1; i++) {
			sum += arr[i];
		}
		arr[arr.length-1] = sum ;
		return sum;
	}
	
	int add1(int... arr) {
		int sum = 0;
		for(int i=0; i< arr.length; i++) {
			sum += arr[i];
		}		
		return sum;
	}
	
	
	//문자열을 가변인자로 받아서 출력
	void arr(String...a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}
	void arr1(String...b) {
		for(String a:b) {
			System.out.println(a);
		}
	}
	
}

public class J20210420_03_overloading {
	public static void main(String[] args) {
		Sum s = new Sum();
//		System.out.println(s.add(10, 20));
//		System.out.println(s.add(10,20,30));
		//배열
		int[] arr = {10,20,30,40,0};
		System.out.println("합계:"+s.add(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(s.add1(10,20,30,40));
		System.out.println(s.add1(10,20,40,30,40));
		//가인인자
//	s.arr("엄마","아빠","동생");
//		s.arr1("우리","동생","엄마");
	}

}
