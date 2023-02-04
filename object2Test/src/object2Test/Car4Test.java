package object2Test;

public class Car4Test {
	
	public static void main(String[] args) {
		Car3 a = new Car3(); // 인스턴스를 만들게 되면 무조건 생성자가 실행이 된다.
		a.setData("빨강", 10);
		Car4 i = new Car4("검정", 20); // 인스턴스가 만들어 질 때 실행되는 메서드
		System.out.println(i.getColor());
		System.out.println(i.getSpeed());
		
		Car4 b = new Car4(); // 생성자는 단 한번만 실행이 된다. 인스턴스가 만들어질 때
		// 인스턴스가 만들어진 후에는 생성자를 사용할 수 없다.
		b.setColor("노랑");
		b.setSpeed(10);
		
		Car4 c = new Car4();
		c.setData("파랑", 20);
	}
}
