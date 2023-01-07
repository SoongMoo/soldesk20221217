package condition;

import java.util.Scanner;

public class conditionEx5 {
	public static void main(String [] args) {
		// 다중 if문
		/* 주석
		if(args[0].equals("/?")) {
			System.out.println("/A          지정된 특성을 가진 파일을 보여 줍니다");
		}else if(args[0].equals("1")) {
			System.out.println("홀수입니다.");
		}
		*/
		System.out.println("점수를 입력해주세요. : ");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt(); // C
		if(score >= 90) { 
			System.out.println("A");
		}else if(score >= 80){      // 89이하 ~ 80
			System.out.println("B");
		}else if(score >= 70){ // 79이하  ~ 70
			System.out.println("c");
		}else if(score >= 60) { // 69 이하 ~ 60
			System.out.println("D");
		}else { // 59 ~ 0
			System.out.println("F");
		}

	}
}
