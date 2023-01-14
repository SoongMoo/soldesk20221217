package array;

public class ArrayEx12 {

	public static void main(String[] args) {
		// 1차원 배열의 초기화 
		int [] arrayInt = new int[] {10,20,30,40};
		int [] arrayInt1 = {10,20,30,40};
		int [] arrayInt2;
		arrayInt2 = new int[] {10,20,30,40};
		// 2차원 배열의 초기화
		int [][] metricsInt = new int[][] {
			{10,20,30,40},{10,20,30,40},{10,20,30,40}
		};
		int [][] metricsInt1 = {
			{10,20,30,40},{10,20,30,40},{10,20,30,40}
		};
		int [][] metricsInt2;
		metricsInt2 = new int[][] {
			{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}
		};
		for(int row = 0; row <= 2 ; row++ ) {
			for(int col =0; col <= 3; col++) {
				System.out.print("metricsInt2["+row+"]["+ col + "] = " + metricsInt2[row][col] +",");
			}
			System.out.println();
		}
		//                          면 행 열                           
		int cubeInt[][][] = new int[2][3][4];
		int [][][] cubeInt1 = {
				{
					{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}
			},{
				{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}
			}
		}; 
		System.out.println(cubeInt1[1][1][0]);
		for(int face = 0; face < 2 ; face++) {
			for(int row = 0 ; row < 3 ; row++) {
				for(int col = 0; col < 4 ; col++) {
					System.out.print(cubeInt[face][row][col]+",");
				}
				System.out.println();
			}
		}
	}
}
