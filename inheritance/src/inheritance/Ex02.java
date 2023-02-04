package inheritance;

public class Ex02 {
	final static float PI = 3.141592f; // 값을 변경할 수 없는 수 : 상수 
	final static int MAX = 100;
	final static int MIN = 0;
	public static void main(String[] args) {
		int i = 10; // 변수 : 값이 변하는 수 
		i = 20;
		i = 30;
		// PI = 10.000f; 상수의 값을 변경하려해서 오류 발생.
		int radius = 30;
		double result = radius * radius * PI;
		System.out.println(result);
		Sedan2 a = new Sedan2();
		a.setSpeed(30);
		System.out.println(a.getSpeed());
		a.downSpeed(5);
		System.out.println(a.getSpeed());
		a.upSpeed(20);
		System.out.println(a.getSpeed());
	}

}
