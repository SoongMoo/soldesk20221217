package inheritance;

public class Calculator {
	int num1;
	int num2;
	
	public Calculator(int num1, int num2) { // 부모 클래스 생성자
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("부모 클래스 생성자");
	}
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getAdd() {
		int result = num1 + num2;
		return result;
	}
	public int getDiv() {
		int result = num1 / num2;  // num1 = 0, num2 = 10 : 0/10 = 0 부정
		return result;
	}
}
