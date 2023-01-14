package string_method;

import java.util.Scanner;

public class StringEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("1문자열을 입력하세요 : ");
		str = "Java를 공부하는 중, Java는 재밌어요.*^^*";
		// 문제) '공'문자가 있는 위치 부터 6글자를 출력하세요.
		System.out.println(str.indexOf('공'));
		System.out.println(str.substring(str.indexOf('공'), str.indexOf('공') + 6));
		
		String str1 = "   한글 ABCD efgh ";
		System.out.println("원 문자열 ===> [" + str1 + "]");
		System.out.println("대문자로 ==> [" + str1.toUpperCase()+ "]");
		System.out.println("소문자로 ==> [" + str1.toLowerCase()+ "]");
		//이 숭무 // 앞뒤에 있는 공백문자만 제거
		System.out.println("공백문자 제거 ===> [" + str1.trim()+ "]"); // [한글 ABCD efgh]
	}
}
