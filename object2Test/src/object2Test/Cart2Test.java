package object2Test;

public class Cart2Test {

	public static void main(String[] args) {
		int car = 10;
		Car2 i = new Car2(); // i 인스턴스 : color, speed
		i.setColor("빨강");  // i.color = "빨강";
		i.setSpeed(10);;    // i.spped = 10;
		// 하나의 변수에 여러 유형의 데이터를 저장
		System.out.println(car);
		System.out.println(i.getColor()); // i.color
		System.out.println(i.getSpeed()); // i.speed
		i.upSpped(20);
		Car2 i2 = new Car2(); // i1 인스턴스 : color, speed
		// i2.color = "빨강";
		System.out.println(i.getSpeed()); // i.color
	}

}
