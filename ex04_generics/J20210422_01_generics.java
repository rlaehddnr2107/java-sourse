package ex04_generics;
//가로 세로 넓이 
//제네릭 타입 : 인스턴스 생성시 형을 결정
//T :Type K :Key E :Element
class Rec<T>{
	private T we;
	private T he;
	private double ar;
	public Rec(T we, T he) {
		super();
		this.we = we;
		this.he = he;
		ar= getAr(we,he);
	}
	public T getWe() {
		return we;
	}
	public void setWe(T we) {
		this.we = we;
	}
	public T getHe() {
		return he;
	}
	public void setHe(T he) {
		this.he = he;
	}
	public double getAr() {
		return ar;
	}
	public double getAr(T we, T he) {
		double result = 0;
		if (we instanceof Integer) { //width가 Integer형이라면
			result =(int)we * (int)he;
		}else if (we instanceof Double)
			result =(double)we * (double)he;
		
		return result;
	}
	@Override
	public String toString() {
		return "Rec [we=" + we + ", he=" + he + ", ar=" + ar + "]";
	}
	
}





public class J20210422_01_generics {

	public static void main(String[] args) {
		Rec<Integer> r1= new Rec<>(5,4);
	System.out.println(r1);
	Rec<Double> r2= new Rec<Double>(5.3,4.3);//뒤에는 래퍼클래스 생략 가능
	System.out.println(r2);
	
	}

}
