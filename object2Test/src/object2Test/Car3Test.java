package object2Test;

public class Car3Test {
	public static void main(String[] args) {
		Car3 a = new Car3();
		a.setData("빨강", 10);
		/*
		a.setColor("빨강");
		a.setSpeed(10);
		*/
		Car3 b = new Car3();
		b.setData("검정", 20);
		/*
		b.setColor("검정");
		b.setSpeed(20);
		*/
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
	}
}
