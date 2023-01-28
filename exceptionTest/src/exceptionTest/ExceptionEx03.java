package exceptionTest;

import java.util.Scanner;

public class ExceptionEx03 {

	public static void main(String[] args) {
		int[] aa = new int[3];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("요소 번호를 입력해 주세요");
			int idx = sc.nextInt();
			System.out.print("첫번째 숫자를 입력해 주세요");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력해 주세요");
			int num2 = sc.nextInt();
			try {
				aa[idx] = num1/num2; // ArithmeticException
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("요소의 크기 잘 못되었습니다");
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수는 없습니다.");
			}catch(Exception e) {
				System.out.println("오류가 발생했습니다.");
			}finally {			
				System.out.println("오류가 있든 없든 무조건 실행 되는 명령");
				continue;
			}
		}
	}
}
