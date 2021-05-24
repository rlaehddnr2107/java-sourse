package ex01_class;
//결과 값이 저장되는 계산기
class NewCal{
	//필드 maker, (result)결과
	String maker ="새로운 계산기";
	double result;
	//메소드: 결과값에 더하는 기능
	//오버로딩 : 메소드의 이름은 같고 매개 변수의 형이 다른경우 메소드의 이름을 중복가능
	void add(double a) {
		result +=a;
	}
	double add (double a,double b) {
		return a+a;
	}
	void add(int a) {
		result += a;
	}
	void q(double a) {
		result -=a;
	}
	void w(double a) {
		result *=a;
	}
	void e(double a) {
		result /=a;
	}
}
public class J20210419_02_newCal {

	public static void main(String[] args) {
		NewCal nc1 = new NewCal();
//		System.out.println(nc1.result);
//		nc1.add(100);
//		System.out.println(nc1.result);
//		nc1.q(1);
//		System.out.println(nc1.result);
//		nc1.w(100);
//		System.out.println(nc1.result);
//		nc1.e(100);
//		System.out.println(nc1.result);
		//System.out.println(nc1.add(10, 100));
	System.out.println(nc1.add(100));
	}

}
