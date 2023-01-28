package methodTest;

import java.util.Scanner;

public class MethodEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, res;
		String oper;
		System.out.println("첫번째 숫자를 입력 : ");
		a = s.nextInt(); s.nextLine();
		System.out.println("계산 입력 (+, -, *, /) : ");
		oper = s.nextLine();
		System.out.println("두번째 숫자를 입력 : ");
		b = s.nextInt();
		
		res = calc(a, b, oper);
		System.out.printf("계산 결과는 : %d\n", res);
		s.close();
	}
	public static int calc(int i, int j, String op) {
		int result = 0;
		switch (op) {
		case "+" : result = i + j; break;
		case "-" : result = i - j; break;
		case "*" : result = i * j; break;
		case "/" : result = i / j; break;
		}
		return result;
	}
}
