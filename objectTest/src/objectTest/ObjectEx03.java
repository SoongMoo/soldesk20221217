package objectTest;

public class ObjectEx03 {

	public static void main(String[] args) {
		//myCar1 인스턴스
		Car1 myCar1 = new Car1();
		myCar1.color = "빨강";
		myCar1.speed = 0;
		//myCar2 인스턴스
		Car1 myCar2 = new Car1(); 
		myCar2.color = "파랑";
		myCar2.speed = 0;
		//myCar3 인스턴스
		Car1 myCar3 = new Car1(); 
		myCar3.color = "노랑";
		myCar3.speed = 0;
		
		myCar1.upSpeed(10); // 10 : argument
		System.out.println("myCar1은 색상은 "+myCar1.color+"이고 속도는 "+myCar1.speed+"이다.");
		myCar2.upSpeed(20);
		System.out.println("myCar2은 색상은 "+myCar2.color+"이고 속도는 "+myCar2.speed+"이다.");
		myCar3.upSpeed(0);
		System.out.println("myCar3은 색상은 "+myCar3.color+"이고 속도는 "+myCar3.speed+"이다.");
	}

}
