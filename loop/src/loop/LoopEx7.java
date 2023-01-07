package loop;

import java.util.Scanner;

public class LoopEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			System.out.print("더할 첫번째 수를 입력하세요. : ");
			a = sc.nextInt();
			System.out.print("더할 두번째 수를 입력하세요. : ");
			b = sc.nextInt(); sc.nextLine();
			System.out.printf("%d + %d = %d\n", a,b , a+b);
			
			System.out.printf("프로그램을 종료하려면 Y또는 y를 누르세요");
			String str = sc.nextLine();
			if(str.equals("Y") || str.equals("y")) break;
		}
	}
}
