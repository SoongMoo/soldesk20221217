package abstractTest;

public class Truck extends Car {
	int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public void upSpeed(int value) {
		this.speed += value - 2;
	}
	@Override
	public void downSpeed(int value) {
		this.speed -= value + 3;
	}
}
