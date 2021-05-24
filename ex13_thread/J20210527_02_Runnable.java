package ex13_thread;
//스레드만들기 2
class MyRunn implements Runnable{

	@Override
	public void run() {
//		for(int i=0; i< 10; i++) {
//			System.out.println("runnable 스레드" + i);
//		}
		
	}
	
}

public class J20210527_02_Runnable {

	public static void main(String[] args) {
//		MyRunn myRun = new MyRunn();//실행구현
//		Thread th = new Thread(myRun); //쓰레드 생성
//		th.start(); //쓰레드 시작
	//익명 클래스
//		Runnable MyRun = new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
		//스레드 1 생성
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i< 10; i++) {
					System.out.println("runnable 스레드" + i);
				}
			}
		});
		th.start();
		
		
		//메인 스레드에서 동작
		for(int i = 0;i<10;i++) {
			System.out.println("main 스레드" + i);
			
		}

	}

}
