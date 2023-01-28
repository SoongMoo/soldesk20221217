package exceptionTest;

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0;
		int result;
		try {
			result = a / b;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
