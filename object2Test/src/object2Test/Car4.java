package object2Test;

public class Car4 {
	private String color; // 인스턴스 변수 // 멤버 필드
	private int speed;
	
	// 생성자 오버 로딩
	public Car4() {} // 생성자를 만든 경우 default생성자는 자동으로 만들어지지 않으므로
	                 // default 생성자가 필요한 경우 직접 만들어 사용해야 한다.
	public Car4(String color, int speed) { // 생성자 // 인스턴스가 생성이 될 때 인스턴스변수를 초기화 하기 위해서
		this.color = color; 
		this.speed = speed;
	}
	public Car4(int speed, String color) { // 생성자
		this.color = color; 
		this.speed = speed;
	}
	public Car4(String color) { // 생성자
		this.color = color; 

	}
	public Car4( int speed) { // 생성자
		this.speed = speed;
	}
	//메서드 오바로딩
	public void setData(String color , int speed ) { // 인스턴스 변수를 초기 화 하기 위해서 
		this.color = color; 
		this.speed = speed;
	}
	public void setData(int speed ,String color  ) {
		this.color = color; 
		this.speed = speed;
	}
	public void setData(int speed ) {
		this.speed = speed;
	}
	public void setData(String color  ) {
		this.color = color; 
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
