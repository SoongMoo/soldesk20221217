package string_method;

import java.util.Scanner;

public class StringEx04 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 ====> ");
		str =  sc.nextLine();
		
		System.out.print("출력 문자열 ====> ");
		if(!str.startsWith("(")) { // 시작하는 문자열
			System.out.print("(");
		}
		for(int idx = 0; idx < str.length() ; idx++) {
			System.out.print(str.charAt(idx));
		}
		if(!str.endsWith(")")){ // 끝나는 문자열
			System.out.print(")");
		}
	}
}
