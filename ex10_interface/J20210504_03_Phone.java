package ex10_interface;
interface Call{
	void call();
}
interface Photo{
	void photo();
}
interface Memo{
	void memo();
}

//전화 사진찍기
class Phone implements Call,Photo{

	@Override
	public void photo() {
		System.out.println("512화소");
		
	}

	@Override
	public void call() {
		System.out.println("전화걸기");
		
	}
	
}
//전화 사진찍기, 메모
class NewPhone implements Call,Photo,Memo{

	@Override
	public void memo() {
		System.out.println("메모기능");
		
	}

	@Override
	public void photo() {
		System.out.println("15만 화소");
		
	}

	@Override
	public void call() {
		System.out.println("전보다 깨끗한 음질");
		
	}
	
}
class PhoneUse{
	void call(Call c) {
		c.call();
	}
	void photo(Photo p) {
		p.photo();
	}
	void memo(Memo M) {
		M.memo();
	}
}


public class J20210504_03_Phone {

	public static void main(String[] args) {
		PhoneUse pu = new PhoneUse();
		Phone oldp = new Phone();
		NewPhone newp = new NewPhone();
		pu.call(oldp);
		pu.call(newp);
	}

}
