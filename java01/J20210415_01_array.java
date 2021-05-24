package java01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {
		// 배열
//		int cnt = 5;
//		int []arr; //선언은 stack에
//		//배열은 heap에 생성
//		//자바를 동적 배열
//		arr = new int[cnt]; //객체 생성해서 주소를 arr에 대입
//		arr[0] = 10;
//		System.out.println(arr[0]);
//		//arr[5] =100; //5번 index는 없다 //에러
	
		//선언하고 객체를 생성
//		int [] arr = new int[5];
//		//1~5값을 대입
//
//		for (int i =0;i<arr.length;i++) {
//			arr[i]=(i+1)*10;
//			
//			System.out.println(arr[i]);
//			
//		}
		//선언과 초기화
//		int[]arr =new int[] {10,20,30};
//		int[]arr = {10,20,30,40};
//		for (int i =0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		//for ~each문
//		for(int a : arr) {
//				System.out.println(a);
//	}
//		//Arrays 클래스 이용 문자열 출력
//	System.out.println(Arrays.toString(arr)); //오버로딩
//	System.out.println(arr); //println 메소드는tostring() 실행
//	System.out.println(arr.toString());//오버라이딩
		
		//점수의 합계와 평균을 구해라
//		int [] sc = {88,89,77};
//		int sum = 0;
//		for(int a : sc) {
//			sum+=a;
//			
//		}
//		System.out.println("합계 " + ":" +sum);
//		System.out.printf("평균은 %.2f 점" , (double)sum / 3 );
		
//		Scanner sc = new Scanner(System.in);
//		int [] arr =new int[3];
//		int sum =0 ;
//		
//		for (int i=0;i<arr.length;i++) {
//		System.out.println("점수를 입력하시오");
//		arr[i]= sc.nextInt();
//		
//		
//		}
//		System.out.println("합계는" +sum+ "입니다");
//		System.out.println("평균은(는)" +((double)sum/arr.length)+ "입니다");
		
		
		
		
		//문자열 배열
		//String[] arr= new String[] {"jo","pg","c"}; //
//		String[] arr= {"jo","pg","c"};
//		System.out.println(arr);
//		for (String s:arr) {
//			System.out.println(s):	
//		}

		//색깔을 입력 받아 배열에 저장하고 출력하시오
//		Scanner sc = new Scanner(System.in);
//		String[] arr =new String[3];
//		int sum = 0;
//		int i;
//		for (i=0;i<arr.length;i++) {
//			System.out.println("좋아하는 색깔을 입력하세요");
//			arr[i]= sc.nextLine();
//					
//		}
//		System.out.println("----------------------------------");
//		System.out.println("----------------------------------");
//		for (String s:arr) {
//			System.out.println(s);
//		}
	//피보나치 수열 n개 구하기
	//	0,1,1,2,3,5,8,13
//		Scanner sc = new Scanner(System.in);
//		System.out.println("피보나치의 숫자의 개수를 입력하시오");
//		int n =sc.nextInt();
//	
//		int[] fibo = new int[n];
//		fibo [0]=0; fibo[1]=1;
//		
//		for (int i=2;i<n;i++) {
//			fibo[i]= fibo[i-2]+fibo[i-1];
//			
//		}
//		for(int f :fibo) {
//			System.out.println(f);
//		}

		//실습 시험 채점 프로그램
//		int [] so = {1,4,2,4,3};
//		int []ans = {1,2,2,4,3};
//		int sum = 0; //맞은 답수
//				
//		for (int i =0;i<so.length;i++) {
//		
//		if (so[i]==ans[i]) {
//			System.out.println(i+1+" 번 정답");
//			sum+=100/so.length;
//		}
//		else if (so[i]!=ans[i]) {
//			System.out.println(i+1+" 번 오답입니다");	
//			sum-=100/so.length;	
//		}
//		
//		}	
//		System.out.println(sum +"점");
		
		//실습 최댓값 최솟값 출력 
//		int [] arr = {2,3,5,6,10};
//		int max = arr[0];
//		int min = arr[0];
//		for(int i = 0;i<5;i++) {
//			if (min<arr[i]) {
//				min=arr[i];
//			}
//			else if(max<arr[i]) {
//				max =arr[i];
//			}
//		}
//		System.out.println("최솟값 : "+ min);
//		System.out.println("최댓값 : " + max);
		
		
		
//		김동욱 구교천 김영진 김정훈 노우민 지도용 서승우 정준휘 반해찬 
//		//선택 정렬(오름차순 정렬)
//	int[] a = {1,9,7,5,4};
//	int b; //최솟값으로 정해 놓고
//	for (int i =0;i<a.length -1;i++) { //i는 0 i는 a의 길이-1 i플플
//		for(int j=i+1;j<a.length;j++) { //j는 i의1을 더한값 a의 길이 j플플 
//			if(a[i] < a[j]) { //만약 a라는 배열 중[i]가 a라는 배열중j보다 크다면 
//				b = a[j]; //
//				a[j] = a[i];
//				a[i] = b;
//			}
//		}
//	}
//	
//	for(int i = 0 ; i <  a.length ; i ++) {
//		System.out.print(a[i]);
//			
		//로또
//		int []no= {};
		//int의 범위
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int[]no = new int[6];
		Random rd = new Random();
		
		for (int i=0;i<no.length;i++) {
			boolean b = false; //기존에 존재 하지 않는다
			int r =rd.nextInt(7)+1;
			//기존에 번호가 등록되어 있다면
			for(int j=0;j<i;j++) {
				if (no[j]==r) {
					i--;
					b= true;
					break;
			}
				
		}
		if (b)continue;	 //기존에 존재 한다면
		no[i]=r;
		}
		Arrays.sort(no);//오름 차순 정렬
		System.out.println(Arrays.toString(no));
		
		
		//배열의 복사
		//얕은 복사 : 주소만복사
//		int[]src= {1,2,3,4,5};
//		int[]dest = src;
//		System.out.println(src[1]);
//		System.out.println(dest[1]);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		src[1] =20;	dest[3]=40;
//		System.out.println();
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		//깊은 복사 : 값을 복사
//		int []src = {1,2,3,4,5};
//		int []dest= new int[6];
//		System.out.println("src :"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
//		for (int i=0;i<src.length;i++) {
//			dest[i]=src[i];
//}
//		dest[5]=6;
//		System.out.println("src :"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
//		src = dest;
//		System.out.println("src :"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
		
		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);	
//		}	
		
		//배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int []dest = {0,0,0,0,0};
//		
//		System.arraycopy(src,2,dest,0,3                                                  );
//		System.out.println("src :"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
		
	//실습 숫자를 입력 하면 정답인지 확인 하기
//		int []no= new int[45];
//		for (int i=0;i<no.length;i++) {
//			int r = (int)(Math.random()*10 +1);
//			for (int j:r) {
//				System.out.println(j);
//			}
//			
//		}
		
	}
}
