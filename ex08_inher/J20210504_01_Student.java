package ex08_inher;

//부모클래스(학교)
class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
		
	}
	void info(String name) {
		//자식클래스의 오버라이딩 때문에 공백으로 처리 해도 됨 (컴파일 에러 방지)
	}
}
//자식클래스(학생)
class Stud extends School{
	@Override
	void info(String name) {
		System.out.println(name + "학생");
	}
	
}
class Tech extends School{
	@Override
	void info(String name) {
		System.out.println(name + "선생님");
	}
}

public class J20210504_01_Student {
	public static void main(String[] args) {
		School s1 = new Stud();
		s1.schoolName();
		//s1.info 부모에는 info가 없기 때문에 다운 캐스팅 
		//((Stud)s1).info("홍길동");//다운 캐스팅
		s1.info("홍길동"); //부모형에 void info 라는 애가 있어야함
		System.out.println("_____________________");
		s1 = new Tech();
		((Tech)s1).info("정연미");
		s1.schoolName();
		
		
	}

}
