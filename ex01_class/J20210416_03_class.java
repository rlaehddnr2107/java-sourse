package ex01_class;
//클래스
class Dog{
	//속성:필드
	//자동초기화
	String type ="강아지";
	String name="개똥이";
	int legs=4;
	int cnt; //걸음수
	
	//기능 : 메소등
	void working() {
		cnt++;
		System.out.println(name + "걷는다");
		
	
	}
	void eat() {
		System.out.println(name+ "먹는다");
	}
		
}
//
public class J20210416_03_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=	new Dog();
			System.out.println(d1.type);
			System.out.println(d1.legs);
			d1.working();
			System.out.println(d1.cnt);
			d1.eat();
	}

}
