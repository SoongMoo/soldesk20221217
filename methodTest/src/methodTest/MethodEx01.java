package methodTest;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값을 입력해 주세요 : ");
		int x  = sc.nextInt();
		System.out.print("y 값을 입력해 주세요 : ");
		int y  = sc.nextInt();
		int z = f(x, y) ;
		System.out.println("z = " + z);
	}
	/// f(x, y) = 3x + 4y [함수의 정의 : 피 호출 함수, x:매개변수 , 가인자 , parameter]라는 함수가 있을 때 f(4)의 결과는?
	///                   [ f : 함수명 ] 
	/// z = f(4, 6) [함수 실행 :호출 함수] : 4를 인자 , argument : 함수명을 이용해서 호출한다.
	/// z = 16
	
	public static int f(int x, int y) {
		return 3*x + 4*y;
	}

}


