package exceptionTest;

import java.util.Scanner;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int[] aa = new int[3];// 0,1,2
		Scanner sc = new Scanner(System.in); // 표준 입력
		while(true) {
			System.out.println("요소 번호를 입력해 주세요"); // System.out : 표준 출력
			int idx = sc.nextInt();
			System.out.println("요소에 들어 갈 값을 입력해 주세요.");
			int val = sc.nextInt();
			try {
				
				aa[idx] = val;
			
			}catch(ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("요소번호는 2번까지 입니다.");
				continue;
			}
			System.out.printf("aa[%d] = %d\n", idx, aa[idx] );
		}
	}
}
