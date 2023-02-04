package abstractTest;

public class Sedan3 implements  CarInterface{
	int speed;
	String color;
	
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
	@Override
	public void upSpeed(int value) {
		speed += value + 10;		
	}
	@Override
	public void downSpeed(int value) {
		speed -= value - 5;		
	}
	

}
