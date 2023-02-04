package inheritance;
            // 자식 클래스          // 부모 클래스
public class FourCalculator extends Calculator{
	
	public FourCalculator() {
		super(0, 0);
		System.out.println("자식 클래스 생성자");
	}
	
	public FourCalculator(int num1 , int num2) { // 자식 클래스 생성자.
		super(num1, num2); // super()는 부모 클래스의 생성자를 의미한다. 
		System.out.println("자식 클래스 생성자");
	}
	
	public int getSub() {
		int result = num1 - num2;
		return result;
	}
	public int getMul() {
		int result = num1 * num2;
		return result;
	}
	
	@Override 
	// 상속 받은 메서드를 재정의
	public int getDiv() {
		int result = 0;
		if(num2 == 0)
			result = 0;
		else result = num1 / num2;
		return result;
	}
	
	public int getSuperDiv() {
		return super.getDiv(); // 부모 클래스에 있는 재정의 된 메서드 호출 
	}
	
}
