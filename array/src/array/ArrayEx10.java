package array;

public class ArrayEx10 {

	public static void main(String[] args) {
		int [] intArray0 = new int[4];
		int [] intArray1 = new int[4];
		int [] intArray2 = new int[4];
		intArray0[0] = 100;
		for(int idx = 0 ; idx < intArray0.length; idx++ ) {
			intArray0[idx] = 100 * (idx+1); 
		}
		for(int idx = 0 ; idx < intArray1.length; idx++ ) {
			intArray1[idx] = 100 * (idx+1); 
		}
		for(int idx = 0 ; idx < intArray2.length; idx++ ) {
			intArray2[idx] = 100 * (idx+1); 
		}
		System.out.println(intArray0[0]);
		////////////////////////////////////////////
		int [][] intArray = new int[3][4];
		intArray[0][0] = 100;
		for(int idx = 0 ; idx < intArray[0].length; idx++ ) {
			intArray[0][idx] = 100 * (idx+1); 
		}
		for(int idx = 0 ; idx < intArray[1].length; idx++ ) {
			intArray[1][idx] = 100 * (idx+1); 
		}
		for(int idx = 0 ; idx < intArray[2].length; idx++ ) {
			intArray[2][idx] = 100 * (idx+1); 
		}
		/////////////////////////////////////////
		for(int row= 0 ; row <= 2 ; row++ ) {
			for(int idx = 0 ; idx < intArray[row].length; idx++ ) {
				intArray[row][idx] = 100 * (idx+1); 
			}
		}
		///////////////////////////////////////////////////////////
		for( int [] row : intArray) {
			for(int val : row) {
				System.out.println(val + ",");
			}
		}
		//////////////////////////////////////////////////////
		System.out.println(intArray.length); // 행의 크기 // 1차원배열의 갯수
		System.out.println(intArray[0].length); // 열의 크기 // 1차원의 크기
		//////////////////////////////////////////////////////////
		for(int row = 0 ; row < intArray.length ; row++) { // 1차원의 갯수만큼 반복
			for(int col = 0; col < intArray[row].length ; col++) {
				System.out.print("intArray[" + row + "][" + col + "] = " + intArray[row][col] + ",");
			}
			System.out.println();
		}
	}
}