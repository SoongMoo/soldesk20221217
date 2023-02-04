package object2Test;

public class Car2 {
	private String color; // 인스턴스 변수 // 멤버 필드
	private int speed;
	// private, public , default , protected: 접근 지정자
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// getter 메서드 : 멤버필드가 가지고 있는 값을 가지고 오기 위한 메서드
	// setter 메서드 : 멤버필드에 값을 주기 위한 메서드

	public void upSpped(int value) {
		this.speed += value; 
	}
	public void downSpeed(int value) {
		this.speed -= value;
	}
	
}
