package condition;

import java.util.Scanner;

/// 순차적 프로그램
public class ConditionEx4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("정수를 입력해주세요.");
		a = s.nextInt();
		if(a % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}
}