package inheritance;

public class Car2 {
	String color;
	int speed;
	
	public final void upSpeed(int value) { // final method : 오버라이드를 하지 못한다.
		speed += value;
	}
	public void downSpeed(int value) {
		speed -= value;
	}
	
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
}
