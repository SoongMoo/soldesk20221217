package object2Test;

public class Car3 {
	private String color; // 인스턴스 변수 // 멤버 필드
	private int speed;
	
	public Car3() {} // default 생서자
	
	public void setData(String color, int speed) { // 인스턴스 변수를 초기화하기 위해서 
		this.color = color; 
		this.speed = speed;
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

	public void upSpped(int value) {
		this.speed += value; 
	}
	public void downSpeed(int value) {
		this.speed -= value;
	}
}
