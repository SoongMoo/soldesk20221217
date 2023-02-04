package object2Test;

public class CarTest {

	public static void main(String[] args) {
		// 
		Car car = new Car();
		car.color = "검정";
		car.speed = 10;
		int [] i1 = new int[4];
		int i = 10; // 비지니스 자료형
		int j = 10;
		Car car2 = new Car();
		car2.color = "파랑";
		car2.speed = 400;
		
		Human h = new Human();
		h.addr = "서울";
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(car.color);
		System.out.println(car.speed);
		System.out.println(car2.color);
		System.out.println(car2.speed);
	}
}
