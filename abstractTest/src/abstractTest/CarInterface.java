package abstractTest;

public interface CarInterface {
	static final float PI = 3.141592f; // 상수
	// 추상메서드만 가지고 있는 것을 인터페이스
	public void upSpeed(int value); // 추상 메서드
	public void downSpeed(int value); // 추상메서드
	// 일반 메서드는 포함 할 수 없다.
	/*
	public void getValue() {
		System.out.println("jmvjkxzvs");
	}
	*/
}
