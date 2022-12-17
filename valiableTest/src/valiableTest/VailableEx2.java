package valiableTest;

public class VailableEx2 {
	public static void main(String[] args) {
		int i = 10; // 변수 생성
		char ch = 'i';
		double d = 20.5;
		float f = 10.5f;
		double ii = 10;
		// int i = 10; 변수는 두번 만들 수 없다.
		System.out.println(i); // 10
		i = 20;
		System.out.println(i); // 20
		int i1;
		i1 = 100;
		System.out.println(i1);
		/*
		int i2; 변수를 사용하기 위해선 변수레 값이 존재해야한다.
		System.out.println(i2);
		*/
	}
}
