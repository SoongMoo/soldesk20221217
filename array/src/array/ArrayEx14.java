package array;

public class ArrayEx14 {

	public static void main(String[] args) {
		int arrayInt [] = new int[] {10,20,30,40};
		int arrayInt1[] = new int[] {100,200,300};
		int arrayInt2[] = new int[] {11,22,33,44,55};
		
		int [][] metricsInt = new int[3][];
		metricsInt[0] = arrayInt;   // [00][01][02][03]
		metricsInt[1] = arrayInt1;  // [10][11][12]
		metricsInt[2] = arrayInt2;  // [20][21][22][23][24]
		
		System.out.println(arrayInt1[1]);
		System.out.println(metricsInt[1][1]);
		
		for(int row=0 ; row < metricsInt.length ; row++) {
			for(int col = 0; col < metricsInt[row].length ; col++) {
				System.out.printf("metricsInt[%d][%d] = %d , ", row, col ,metricsInt[row][col]);
			}
			System.out.println();
		}
		
		int metricsInt2[][] = new int[3][4];
		
		int arrayInt3[] = new int[4];
		int arrayInt4[] = new int[4];
		int arrayInt5[] = new int[4];
		
		int metricsInt3[][] = new int[3][];
		metricsInt3[0] = arrayInt3;
		metricsInt3[1] = arrayInt4;
		metricsInt3[2] = arrayInt5;
		
		
		
	}

}
