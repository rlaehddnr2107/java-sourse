package ex01_class;
//핸드폰 클래스 
class Phone{
	//필드 : 모델명,용량,화소
	private String name;
	private int capacity;
	private int pixel;
	
	//생성자 게터 세터 toString
	public Phone() {}
	public Phone(String name, int capacity, int pixel) {
	//나 자신의 생성자 호출 , 반드시 가장 먼저 실행
		this(name, capacity);//나자신의 생성자 호출
		this.pixel = pixel;
		
	}
	public Phone(String name, int capacity) {
		
		this.name = name;
		this.capacity = capacity;
	}
	//기본생성자
	public Phone() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	



	

}
public class j20210420_02_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("갤럭시",512,120000);
	System.out.println(p1);
	setCapacity(256);
	}

}
