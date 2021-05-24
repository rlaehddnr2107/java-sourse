package ex01_class;
//계산기
class Cal{
	//속성
	String maker= "국제 계산기";
	//기능 : 메소드
	
	int add (int a,int b) {
		int r = a+b;
		return r;
	}
	int sub (int a, int b) {
		return a-b;
	}
	int mul (int a , int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
	
}

public class J20210419_01_Cal {

	public static void main(String[] args) {
	Cal c1 = new Cal();
	System.out.println(c1.maker);
	int a=30,b=10;
	int r =c1.add(a,b);	
	System.out.println("합계 : "+r);
	System.out.println("빼기 : "+ c1.sub(a,b));
	System.out.println("곱셈 : "+c1.mul(a,b));
	System.out.println("나눗셈 : "+c1.div(a,b));
	}

}
