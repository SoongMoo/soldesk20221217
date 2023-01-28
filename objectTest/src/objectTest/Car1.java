package objectTest;

public class Car1 {
	// 멤버 필드
	String color; // 필드 , 인스턴스 변수
	int speed; // 필드 , 인스턴스 변수
	
	void upSpeed(int value) { // value : parameter , 블록변수
		speed += value;
	}
	void downSpeed(int value) {
		speed -= value;
	}
	
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
