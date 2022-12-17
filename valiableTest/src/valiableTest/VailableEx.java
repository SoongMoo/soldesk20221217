package valiableTest;

public class VailableEx {
	public static void main(String [] args) {
		int i = 10; // integer:정수
		// 4byte
		int y = 20;
		int z = i + y;
		float f1 = 10.21f;
		// 4byte
		double d1 = 20.5;
		double d2 = f1 + d1;
		// 8byte
		System.out.println(i + y);
		System.out.println(z);
		System.out.println(d2 );
	}
}


// 상수 : 변하지 않는 수(값) : 리터널
/*       숫자 : 정수 : 10, 400 : 정수형 리터널 : 4byte
 *             실수 : 10.34, 25.00  : 시수형 리터널 :8byte
 *       문자 : '가' , 'a'  : 문자형 리터널 : 2byte
 *       문자열 : 이숭무,  : 문자열형 리터널
 *       부울 : true(참)/false(거짓)*/ // 부울형 리터널 // 1byte
// 변수 : 변하는 수(값)
//       상수를 사용할 수 있게 하는 것
//       i = 10
//       y = 20
//       z = i + y
//       i = 10.55
//       y = 20
//       z = i + y
// 함수 : f(x, y) = 2x + 3y + 4
//       z = f(3, 4)
//       z = ?



