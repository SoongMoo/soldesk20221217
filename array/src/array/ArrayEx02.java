package array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		int intArray [] = new int[5]; 
		int intArray1 [] = {1,2,3,4,5}; 
		int intArray2 [] = new int[] {1,2,3,4,5};
		int intArray3 [];
		intArray3 =  new int[5];
		int intArray5 [];
		intArray5 = new int[] {1,2,3,4,5};
		
		double [] dblArray = new double[5];
		String [] strArray = new String[5];
		boolean [] bolArray = new boolean[5];
		
	    /*
		int intArray6 []; 
		intArray6 = {1,2,3,4,5};
		*/
		
		int intArray4 [] = new int[100]; 
		intArray4 [0] = 10;
		intArray4 [1] = 20;
		intArray4 [2] = 30;
		intArray4 [3] = 40;
		for(int idx = 0 ; idx < 100 ; idx++) {
			intArray4 [idx] = (idx + 1) * 10;  
		}
		for(int idx = 0 ; idx < 100 ; idx++) {
			System.out.println(intArray4 [idx]);
		}
	}
}
