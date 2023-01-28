package objectTest;

public class Car1 {
	String color; // 필드
	int speed; // 필드
	
	void upSpeed(int value) { // value : parameter
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
