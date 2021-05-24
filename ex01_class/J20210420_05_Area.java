package ex01_class;
//원의 넓이를 구하는 클래스
class Cir{
	//필드
	private double r;//반지름
	private double area;//원의 넓이
	//생성자
	Cir(){};
	Cir(double r){	
		this.r = r;
		areaCal(r);//생성자에서 메소드 실행
	}
	@Override
	public String toString() {
		return "Cir [r=" + r + ", area=" + area + "]";
	}
	//게터
	double getArea() {
		return area;
	}
	//메소드:원의 넓이를 구하는 메소드
	double areaCal(double r) {//원의 넓이 계산 메소드
		area = r * r * Math.PI;
		return area;
	
	}double areaCal(int r){
		area = r*r*Math.PI;
		return area;
	}double areaCal(double r , double pi){
		area = r*r*pi;
		return area;
	}double area(int r,double pi){
		area = r*r*pi;
		return area;
	}

	
	
	
}

public class J20210420_05_Area {

	public static void main(String[] args) {
		Cir c1 = new Cir(5.5);
		Cir c2 = new Cir(34.43);
		Cir c3 = new Cir(5);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("넓이"+c1.areaCal(10.5));
	}

}
