package ex08_inher;
//부모클래스
class MyCar{
	static final String name = "porsher boxter";
}
//자식클래스
class Tire extends MyCar{
	private String compony; //회사이름

	public Tire(String compony) {
		this.compony = compony;
	}

	@Override
	public String toString() {
		return "타이어 회사 :" + compony;
	}
	
}
class Mirror extends MyCar{
	private String compony;

	public Mirror(String compony) {
		this.compony = compony;
	}

	@Override
	public String toString() {
		return "백미러 교환 회사 :" + compony;
	}
	
	
}
class Repair extends MyCar{
	//부품을 체인지 해주는 메소드
	//다형성을 이용
	void changePart(MyCar t) {
		System.out.println(t + "결제 완료");
	}
//	void ChanPart(Mirror m) {
//		System.out.println(m + "결제 완료");
//	}
//}
}
public class J20210504_02_Car {

	public static void main(String[] args) {
		System.out.println(MyCar.name);
		Tire t1 = new Tire(" 피렐리");
		System.out.println(t1);
		Mirror m1 = new Mirror(" 모비스");
		//System.out.println(m1);
		Repair r1=new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
		System.out.println();
		

	

}
}
}