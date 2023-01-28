package objectTest;

public class ObjectEx05 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10 ; i++) { // i:블록변수
			System.out.println(i);
		}
		Car1 myCar1 = new Car1();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		Car1 myCar2 = new Car1(); 
		myCar2.setColor("파랑");
		myCar2.setSpeed(0);
		
		Car1 myCar3 = new Car1(); 
		myCar3.setColor("노랑");
		myCar3.setSpeed(0);
		
		myCar1.upSpeed(10);
		System.out.println("myCar1은 색상은 "+myCar1.getColor()+"이고 속도는 "+myCar1.getSpeed()+"이다.");
		myCar2.upSpeed(20);
		System.out.println("myCar2은 색상은 "+myCar2.getColor()+"이고 속도는 "+myCar2.getSpeed()+"이다.");
		myCar3.upSpeed(0);
		System.out.println("myCar3은 색상은 "+myCar3.getColor()+"이고 속도는 "+myCar3.getSpeed()+"이다.");

	}

}
