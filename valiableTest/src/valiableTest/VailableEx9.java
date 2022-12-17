package valiableTest;

public class VailableEx9 {
	public static void main(String[] args) {
		boolean bl1, bl2; // true/false  부울
		bl1 = true; // 부울
		char ch = 'A'; //문자
		String str = "true";//문자열
		System.out.println(bl1);
		System.out.println(str);
		// 비교(관계)연산을 하는 경우 부울타입을 사용하게 된다.
		boolean result = (10 != 10);
		System.out.println(result);
		String str1 = "솔데스크";
		String str2 = "10";
		String str3 = "20";
		int i = 10;
		int j = 20;
		System.out.println("i + j = "+ (i + j));
		System.out.println(
				"str2 + str3 = "+ (str2 + str3));
		// 정밀도
		float f1 = 0.1234567890123456789012345f;
		double d = 0.1234567890123456789012345;
		System.out.println(f1);
		System.out.println(d);
		
		//자동 형변환
		//byte=>char=>short=>int=>long=>float=>double
		//정수 => 실수
		int ii = (int)10.5; // 강제형변환
		long l = 10;
		float fff = l;
		System.out.println(fff);
	}
}
