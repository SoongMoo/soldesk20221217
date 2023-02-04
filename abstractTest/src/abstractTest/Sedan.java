package abstractTest;

public class Sedan extends Car{
	int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	@Override
	public void upSpeed(int value) {
		this.speed += value + 30;
	}
	@Override
	public void downSpeed(int value) {
		this.speed -= value - 5;
	}
}
