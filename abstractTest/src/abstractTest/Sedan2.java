package abstractTest;

public class Sedan2 extends Car2{
	int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
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
