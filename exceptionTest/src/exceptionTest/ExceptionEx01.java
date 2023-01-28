package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i, j;
		String oper;
		while(true) {
			try {
				System.out.println("첫번째 숫자를 입력 : ");
				i = s.nextInt(); s.nextLine();
				System.out.println("계산 입력 (+, -, *, /) : ");
				oper = s.nextLine();
				System.out.println("두번째 숫자를 입력 : ");
				j = s.nextInt();
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				s.nextLine();
				System.out.println("형식에 맞게 다시 입력해 주세요.");
				continue;
			}
			int result = 0;
			switch (oper) {
			case "+" : result = i + j; break;
			case "-" : result = i - j; break;
			case "*" : result = i * j; break;
			case "/" : result = i / j; break;
			}
			System.out.printf("계산 결과는 : %d\n", result);
		}
	}

}
