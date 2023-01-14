package string_method;

import java.util.Scanner;

public class StringEx06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("1문자열을 입력하세요 : ");
		str = s.nextLine(); //Java를 공부하는 중, Java는 재밌어요.*^^*
		                    //012345
		System.out.println(str.replace("Java", "자바"));
		System.out.println("str = " + str); // 원래 데이터는 변경되지 않는다.
		
		strRep = str.replace("Java", "자바");
		System.out.println("strRep = " + strRep);
		System.out.println(str.substring(0 , 8 + 1));
		System.out.println(str.substring(4, 7 + 1)); 
		
		for(int i = 4; i < 8; i++ ) {
			System.out.print(str.charAt(i));
		}
		// index 4번부터 4글자
		System.out.println(str.substring(4, 4 + 4));
		// index 2번부터 8글자
		System.out.println(str.substring(2, 2 + 8));
		
		System.out.println(str.substring(4)); // 4번부터 마지막까지
		System.out.println(str.substring(10));// 10번부터 마지막까지
		
		System.out.print("2문자열을 입력하세요 : ");
		str = s.nextLine(); // IT,CookBook,Java
		strAry = str.split(",");
		for(String s1 : strAry) {
			System.out.println(s1);
		}
		str = s.nextLine(); // IT-CookBook-Java
		strAry = str.split("-");
		for(String s1 : strAry) {
			System.out.println(s1);
		}
	}
}