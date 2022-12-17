package valiableTest;

public class VailableEx8 {
	public static void main(String[] args) {
		int a = 100, b = 200;
		float result = a / b;
		//  01010101  :1byte: 2byte 
		//+ 001010100101010 : 2byte
		//                    2byte
		double d = 10.5  /  2 ; // 10.5/ 2.0
	    //8byte / 4byte = 8byte / 8byte
		int i = (int)10.5  /  2;
		      //8byte / 4byte
		      //4byte / 4byte
		System.out.println(i);
		/*
		double f = (float)10.5  /  2;
		   //8byte / 4byte
		   //4byte / 4byte = 8byte
		 */
		//정수형 자료형 : byte ,char, short, int , long
		//문자형 자료형 : char
		char ch = 65; // A, ascii코드값이나 unicode값
		System.out.println(ch);
		ch=97;  // a
		System.out.println(ch);
		ch = 'C';
		System.out.println(ch);
		ch = 0x41;
		System.out.println(ch);
		
	}
}

