package ex01_class;
//자동차 클래스
//속성 : name,color,power,speed
//기능 : powertoggle, speed up ,speed down
class Car{
String name = "pore";
String color = "green";
boolean power;
int speed;

	void powertoggle(){
		power=!power;
	}
	void speedup() {
		if (speed<100) speed++;
		
	}
	void speeddown() {
		if (speed>50) speed--;
	}



}
//기능 : power토글
public class J20210414_04_car {

	public static void main(String[] args) {
		// 
		Car c1=new Car();
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.speed +"Km/h");
		
		
		c1.powertoggle();
		System.out.println("시동 : " + c1.power);
		
		for(int i= 0;i<120;i++) {
		c1.speedup();
			}
		for(int i= 0;i<100;i++) {
			c1.speeddown();
		}
		System.out.println(c1.speed +"Km/h");
		System.out.println(c1.speed +"Km/h" );
	}

}
