package ex01_class;
//회원클래스
//필드:아이디(String), 비밀번호(String), 출생년도(int), 키(double)
class Member{
	//은닉화 : private 
	private String userid;
	private String passwd; 
	private int year;
	private double height;
	//생성자:객체가 생성될때 실행되는 메소드
	//       반드시 객체가 생성될때 생성자가 실행이 되어야 한다.
	//클래스의 이름과 같다
	//반환형이 없다
	
	//기본생성자
	//만약에 생성자가 없으면 컴파일러가 기본생성자를 생성
	//만약에 생성자를 만들면 컴파일러가 기본생성자를 생성하지 않는다
	//생성자의 오버로딩
	Member(){};
	
	Member(String userid, String passwd, int year, double height){
		this.userid = userid;
		this.passwd = passwd;
		this.year = year;
		this.height = height;
	}
	
	//setter
	void setUserid(String userid) {
		this.userid = userid;
	}
	void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	void setYear(int year) {
		this.year = year;
	}	
	void setHeight(double height) {
		this.height = height;
	}	
	
	//getter
	String getUserid() {
		return userid;
	}
	String getPasswd() { //비밀번호는 앞두자리만 반환
		return passwd.substring(0, 2) + "**";
	}
	int getYear() {
		return year;
	}
	double getHeight() {
		return height;
	}
}
public class J20210419_05_Member {
	public static void main(String[] args) {
		Member m1 = new Member(); //기본생성자를 이용해서 객체를 생성
		m1.setUserid("java");
		m1.setPasswd("1111");
		m1.setYear(1990);
		m1.setHeight(167.8);
		
		//Member m1 = new Member("java", "1111", 1990, 168.8);

		
		System.out.println("아이디:" + m1.getUserid());
		System.out.println("비밀번호:" + m1.getPasswd());
		
		Member m2 = new Member("hong","2222",1990,170);

		
		
		
		

	}

}