package ex13_thread;
//프로그램 : 소스를 컴파일해서 실행코드로 변환된 파일
//프로세스 : 실행파일이 cpu에 의해서 실행된 상태
//스레드 : 프로세스내에서 실행되는 세부 실행 단위
//멀티스레드 : 하나의 프로세스내에서 여러개의 스레드가 병행 처리 
//자바가 멀티스레드로 동작
//스레드 스케쥴링
//JVM의 스레드 스케쥴러가 각 스레드에게 CPU를 할당하여 실행
//스레드 만들기1
class Thread1 extends Thread{ //다중상속 불가능
	//재정의 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("sub thread:" + i);
		}		
	}
}

public class J20210527_01_thread {

	public static void main(String[] args) {
		//스레드 객체 생성
		Thread1 th1 = new Thread1();
		th1.start(); //스레드 실행
		
		Thread1 th2 = new Thread1();
		th2.start(); //스레드 실행

		for(int i=0; i<10; i++) {
			System.out.println("main:" + i);
		}
			

	}

}