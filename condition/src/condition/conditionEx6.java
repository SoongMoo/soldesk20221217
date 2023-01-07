package condition;

import java.util.Scanner;

public class conditionEx6 {
	public static void main(String [] args) {
		
		// 단일 if : if(){}
		// if~else
		//다중 if : if ~ else if(){}else if(){}else if(){}else if(){}else{}

		System.out.println("점수를 입력해주세요. : ");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt(); // C
		// 중첩 if
		if(score >= 90) { /// A+ , A
			if(score >= 95) {
				System.out.println("A+");
			}else { // 90 ~ 94
				System.out.println("A");
			}
		}else if(score >= 80){      // 89이하 ~ 80
			if(score >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else if(score >= 70){ // 79이하  ~ 70
			if(score >= 75) {
				System.out.println("C+");
			}else { 
				System.out.println("C");
			}
		}else if(score >= 60) { // 69 이하 ~ 60
			if(score >= 65) {
				System.out.println("D+");
			}else { 
				System.out.println("D");
			}
		}else { // 59 ~ 0
			System.out.println("F");
		}
	}
}
