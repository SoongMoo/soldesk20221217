package array;
public class ArrayEx11 {
	public static void main(String[] args) {
		int [] intArray = new int[4]; // intArray[][][][] // 1차원배열
		int [][] intArray1 = new int[3][4]; // new int[행][열] // 행열
		intArray[0] = 100;
		///     row col
		intArray1[0][0] =100;
		intArray1[0][1] =200;
		intArray1[0][2] =300;
		intArray1[0][3] =400;
		intArray1[1][0] =500;
		intArray1[1][1] =600;
		intArray1[1][2] =700;
		intArray1[1][3] =800;
		intArray1[2][0] =900;
		intArray1[2][1] =1000;
		intArray1[2][2] =1100;
		intArray1[2][3] =1200;	
		for(int row = 0 ; row <= 2; row++) {
			for(int col = 0; col <= 3 ; col++) {
				intArray1[row][col] = 100 * (row + 1) * (col + 1);
			}
		}
		for(int row = 0 ; row <= 2; row++) {
			for(int col = 0; col <= 3 ; col++) {
				System.out.print("intArray1["+ row + "][" + col + "] = " + intArray1[row][col] +",");
			}
			System.out.println();
		}
	}
}