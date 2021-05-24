package ex01_class;


public class J20210421_03_Calculator {
	public static final String maker = "국제계산기";
	private int result;
	private boolean light;
	private String color;
	public static String getMaker() {
		return maker;
	}
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	//Static 메소드 안에서는 static필드만 사용
	static int add(int a,int b) {
		return a+b;
	}
	int add (int a) {
		this.result+=a;
		return result;
	}
	//라이트 온 오프
	 void light() {
		light =! light;
	}
	public static void main(String[] args) {
		//J20210421_03_Calculator c1 =new J20210421_03_Calculator();
		//System.out.println(c1.add(10, 20));
		System.out.println(J20210421_03_Calculator.getMaker());
		System.out.println("더한 값:"+J20210421_03_Calculator.add(10, 20));
		System.out.println("누적 값:"+J20210421_03_Calculator.add(10, 20));
		J20210421_03_Calculator c1= new J20210421_03_Calculator();
		System.out.println(c1.light);
		System.out.println(c1.light);
		
		
	}

}
