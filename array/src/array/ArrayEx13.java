package array;

import java.util.Scanner;
public class ArrayEx13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		System.out.print("행의 개수를 입력 : ");
		row = s.nextInt();
		System.out.print("열의 개수를 입력 : ");
		col = s.nextInt();
		int val = 1;
		int [][] aa = new int[row][col];
		for(int i = 0; i < row ; i++) {
			for(int k = 0; k < col ; k++ ) {
				aa[i][k] = val++;
			}
		}
		////////////////////////////
		for(int i = 0; i < row ; i++) {
			for(int k = 0; k < col ; k++ ) {
				System.out.print("aa["+ i +"]["+ k +"]=" + aa[i][k] + ",");	
			}
			System.out.println();
		}
	}
}