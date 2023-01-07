package condition;

import java.util.Scanner; // 자바 API

public class ConditionEx3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int year = s.nextInt();
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result); // java API
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
			System.out.println("윤년입니다."); // 조건식의 결과 true
		}else {  // // 조건식의 결과 false
			System.out.println("평년입니다.");
		}
		System.out.println("프로그램 종료.");
	}
}
