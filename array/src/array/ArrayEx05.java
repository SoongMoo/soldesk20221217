package array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,d;
		int hap;
		System.out.print("1번째 숫자를 입력해주세요. : "); 
		a = s.nextInt();
		System.out.print("2번째 숫자를 입력해주세요. : "); 
		b = s.nextInt();
		System.out.print("3번째 숫자를 입력해주세요. : "); 
		c = s.nextInt();
		System.out.print("4번째 숫자를 입력해주세요. : "); 
		d = s.nextInt();
		hap = a + b+ c+ d;
		System.out.println("합계 => " + hap);
		
		int [] intArray = new int[4]; // a,b,c,d
		for(int idx = 0; idx < intArray.length ; idx++) {
			System.out.print((idx + 1) + "번째 숫자를 입력해주세요. : "); 
			intArray[idx] = s.nextInt();
		}
		hap = 0;
		for(int val : intArray) {
			hap += val;
		}
		System.out.println("합계 => " + hap);
	}
}
