package methodTest;

import java.util.Scanner;

public class MethodEx09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = calc();
		System.out.printf("계산 결과는 : %d\n", res);
	}
	public static int calc() {
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
		s.close();
		return result;
	}
}
