package valiableTest;

public class VailableEx6 {

	public static void main(String[] args) {
		int a, b;
		float c, d;
		
		a = 100;
		//b에는 a를 대입
		b = a; // 대입이란 오른쪽에 있는 것을 왼쪽에 주는 것
		System.out.println(b);
		c = 111.11f;
		//d에는 c를 대입
		d = c;
		System.out.println(d);
		
		int i = a = b = 30;
		System.out.printf("%d , %d , %d", i,a,b);
	}
}
