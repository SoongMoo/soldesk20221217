package abstractTest;


public class Tank extends Car implements CarInterface, Cannon   { // 다중 상속
	int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
		
	}
	@Override
	public void upSpeed(int value) {
		speed += value - 10;
	}
	@Override
	public void downSpeed(int value) {
		// TODO Auto-generated method stub
		speed -= value + 5;
	}

}
