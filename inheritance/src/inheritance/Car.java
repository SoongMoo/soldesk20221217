package inheritance;

public class Car {
	String color;
	int speed;
	
	public void upSpeed(int value) {
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
