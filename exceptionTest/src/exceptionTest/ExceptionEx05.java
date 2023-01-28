package exceptionTest;

public class ExceptionEx05 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			// 사용자 예외처리 작성
			if(b == 0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
			result = a / b;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			float f = 100.12345f;
			int i = 10;
			System.out.printf("실수 ==> %12.3f\n", f);
			System.out.printf("실수 ==> %2.3f\n", f);
			System.out.printf("실수 ==> %.3f\n", f);
			System.out.printf("정수 ==> %s\n", i);
			System.out.printf("정수 ==> %s\n", f);
		}

	}

}
