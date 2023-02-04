package abstractTest;

// abstract는 추상메서드를 의미하며 몸체가 없는 메서듣를  말한다. 
// 추상 메서드는  상속 받은 클래스에서 재 정의 하여야 한다.
public abstract class Car2 {  // 상속해서 사용해야한다.
	int speed;
	String color;
	public abstract void upSpeed(int value); // 추상 메서드
	public abstract void downSpeed(int value); // 추상메서드 
	public int getSpeed() // 메서드 머리 
	{                     // -|
		return speed;     //  |  메서드 몸체
	}                     // -|
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
