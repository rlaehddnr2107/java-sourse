package ex08_inher;
//부모클래스
class Shape{
	//다형성을 위해서 메소드 작성
	private int height;
	private int width;
	void printShape() {
	
	}
}

//사각형 클래스
class Rect extends Shape{
	//오버라이딩
	@Override
	void printShape() {
		System.out.println("사각형");
	}
}
//삼각형 클래스
class Tria extends Shape{

	@Override
	void printShape() {
	System.out.println("삼각형");
	}
	
	
	
}

public class J20210503_04_poly {

	public static void main(String[] args) {
		//다형성을 이용하서 메소드를 실행 하려면 오버라이딩이 되어있어야한다
		//상속 관계에 있어서 중요한 문법 
		//runtime시에는 자식 메소드 실행 
		Shape rec = new Rect();
		rec.printShape();
		Shape tria = new Tria();
		tria.printShape();
		
	
	}

}
