package ex08_inher;
class Animal{
}

//토끼
class Rabbit extends Animal{
	@Override
	public String toString() {
		return "토끼";
	}
}

//사자
class Lion extends Animal{
	@Override
	public String toString() {
		return "사자";
	}
}

class AnimalCare{
	//먹이주기 메소드
	void eating(Animal a) {
		System.out.println(a +" 먹이를 주었습니다");
	}
	//목욕시키기 메소드
	void washing(Animal a) {
		System.out.println(a + " 목욕하기");
	}
	
}

public class J20210504_03_Animal {
	public static void main(String[] args) {
		//객체생성
		AnimalCare a1 =new AnimalCare();
		Rabbit anR = new Rabbit();
		Lion anL = new Lion();
		//메소드 실행
		a1.eating(new Rabbit());
		a1.washing(new Lion());
		a1.washing(anR);
		a1.washing(anL);

	}

}
