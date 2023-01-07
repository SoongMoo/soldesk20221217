package loop;

import java.util.Scanner;

public class LoopEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정수값을 입력하시오 : ");
		int start  = sc.nextInt(); sc.nextLine();
		System.out.print("마지막 정수값을 입력하시오 : ");
		int end  = sc.nextInt();
		
		int sum = 0;
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// int j = 100; 오류 발생
		for(int j = start; j <= end ; j++) { //블록변수, for문 안에서만 사용가능
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		int j = 100;
		System.out.println(j);
	}
}
