package inheritance;

public final class Car3 { // final class : 상속을 하지 못하는 class
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
