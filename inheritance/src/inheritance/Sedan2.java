package inheritance;

public class Sedan2 extends Car2{

	int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	@Override
	public void downSpeed(int value) {
		this.speed = this.speed - value - 10;
	}
	
	/*
	@Override
	public void upSpeed(int value) {
		this.speed += value + 10;
	}
	*/
}
