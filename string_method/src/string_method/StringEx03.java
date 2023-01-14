package string_method;

import java.util.Scanner;

public class StringEx03 {

	public static void length() { // 피호출 메서드
		System.out.println(20);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    // 문자열에는 index	
		String str = sc.nextLine(); 
				//"It Cookbook. Java";
	    //         01234567890123456
		//                      1
		int i ;
		// string method
		StringEx03.length(); //호출메서드
		System.out.println(str.length());
		
		// index 에 해당하는 문자 출력
		System.out.println(str.charAt(8));	
		
		for(int i1 = 0; i1 < str.length() ; i1++) {
			if(str.charAt(i1) == 'o') { // 4 5 8 9 
				System.out.printf("%c", '$');
			}else {            ////////////////// 0 1 2 3 6 7 10 11 12 13...16  
				System.out.printf("%c",str.charAt(i1) );
			}
		}
		System.out.println();
		System.out.println(str.charAt(3));
		System.out.println(str.startsWith("I"));
	}
}