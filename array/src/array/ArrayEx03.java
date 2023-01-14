package array;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int [] intArray = new int[4]; // a,b,c,d
		//               intArray[][][][]
		//                        0 1 2 3   //index 
		System.out.print("1번째 숫자를 입력해주세요. : "); 
		intArray[0] = s.nextInt();
		System.out.print("1번째 숫자를 입력해주세요. : "); 
		intArray[1] = s.nextInt();
		System.out.print("1번째 숫자를 입력해주세요. : "); 
		intArray[2] = s.nextInt();
		System.out.print("1번째 숫자를 입력해주세요. : "); 
		intArray[3] = s.nextInt();
		hap = intArray[0] + intArray[1]+ intArray[2]+ intArray[3];
		System.out.println("합계 => " + hap);
		
		
	}

}
