package operationTest;

public class OperateEx6 {
	public static void main(String[] args) {
		// 논리 연산자, true/false
		// 부울데이터를 이용한 연산
		// true && true
		// 논리 곱 : and , &&
		// 논리 합 : or,   ||
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(true || true);
		System.out.println(false || false);
		int a = 10, b=20, x = 25, y=100;
		System.out.println(a < b);
		System.out.println(x < y);
		System.out.println(a < b && x < y);
		System.out.println(a < b || x < y);
	}
}
