package objectTest;

public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.color = "빨강";
		myCar1.speed = 10;
		Car myCar2 = new Car();
		myCar2.color = "파랑";
		myCar2.speed = 20;
		Car myCar3 = new Car();
		myCar3.color = "노랑";
		myCar3.speed = 30;
	}
}

class Car {
	String color;
	int speed;
	int number;
}