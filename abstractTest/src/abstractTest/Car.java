package abstractTest;

public class Car {
	int speed;
	String color;
	public void upSpeed(int value) {
		this.speed += value; 
	}
	public void downSpeed(int value) {
		this.speed -= value;
	}
	public int getSpeed() {
		return speed;
	}
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
