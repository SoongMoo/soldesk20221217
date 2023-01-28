package methodTest;

import java.util.Scanner;

public class MethodEx10 {
	public static void calc() {
		Scanner s = new Scanner(System.in);
		int i, j;
		String oper;
		System.out.println("첫번째 숫자를 입력 : ");
		i = s.nextInt(); s.nextLine();
		System.out.println("계산 입력 (+, -, *, /) : ");
		oper = s.nextLine();
		System.out.println("두번째 숫자를 입력 : ");
		j = s.nextInt();
		int result = 0;
		switch (oper) {
		case "+" : result = i + j; break;
		case "-" : result = i - j; break;
		case "*" : result = i * j; break;
		case "/" : result = i / j; break;
		}
		System.out.printf("계산 결과는 : %d\n", result);
		s.close();
	}
	public static void main(String [] args) {	
		calc();
	}
	
	// 07. 입력값과 결과값을 가지는 메서드 // 일반적인 방식
	// 08. 입력값은 있고 결과값은 없는 메서드
	// 09. 입력값은 없고 결과값은 있는 메서드
	// 10. 입력값은 없고 결과값도 없는 메서드
}
