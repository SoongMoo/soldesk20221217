package operationTest;

public class OperateEx7 {
	public static void main(String[] args) {
		// 비교연산
		int a = 10, b = 20;
		int x = 20, y = 50;
		System.out.println(a > 10);
		System.out.println(x < y);
		System.out.println(a > 10 && x < y);
		//                 false
		System.out.println(a > 10 || x < y);
		//                  false     true   = true
		System.out.println(a == 10 || x > y++);
		//                  true             = true
		System.out.println(y);
		System.out.println(a > 10 || x < y++);
		//                  false      true
		System.out.println(y);
		a = 99;
		System.out.println((a >= 100) && (a <= 200));
		//                   false    &&   true = false
		System.out.println(!(a >= 100)); // not연산
		// not false = true/ not true = false
		int num1 = 100, num2 = -200;
		boolean b1 = (num1 != 0); //true
		boolean b2 = (num2 != 0); //true
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b2); // false
		/* 2300년은  윤년일까요? 평년일까? *
		 * 4년마다 윤년, 100년마다는 평년이다. 
		 * 400년 마다 윤년
		 * 윤년이면 true , 평년이면 false 
		 * year % 4 == 0, year % 100 != 0, year % 400 == 0
		 */
		int year = 2300; 
		boolean result;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
	}
}
