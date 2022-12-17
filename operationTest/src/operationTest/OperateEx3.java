package operationTest;

public class OperateEx3 {
	public static void main(String[] args) {
		// 이항연산자
		System.out.println(10 + 5);
		int i = 10;
		i += 10;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i += 1;
		// 일항 연산자
		System.out.println(i);
		i++; // i = i + 1;
		////
		i = i - 1;
		i -= 1;
		i--;
		System.out.println(i);
		++i; // i = i + 1
		System.out.println(i);
		--i; // i = i -1;
		System.out.println(i);
	}
}
