package operationTest;

public class OperateEx5 {
	public static void main(String[] args) {
		// 비교(관계)연산자
		// 결과는 부울타입이다 , true/false(논리)
		System.out.println(10.5/5); // 
		System.out.println(5*10);
		System.out.println("10"+"20");
		System.out.println(10 > 20); // 부울
		System.out.println(10 < 20); 
		System.out.println(10 <= 20);
		System.out.println(10 >= 20);
		System.out.println(10 == 20);
		System.out.println(10 != 20); 
		int a = 10, b = 20;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= 20);
		
		System.out.printf("%d < %d = %s\n", a,b, a < b);
		System.out.printf("%d <= %d = %s\n", a,b, a <= b);
		System.out.printf("%d == %d = %s\n", a,b, a == b);
		System.out.printf("%d = %d = %s\n", a,b, a = b);
	}
}
