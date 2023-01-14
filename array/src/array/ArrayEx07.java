package array;

public class ArrayEx07 {

	public static void main(String[] args) {
		int [] intArray = new int[100];
		for(int idx = 0 ; idx < intArray.length ; idx++) {
			intArray[idx] = idx * 2;
		}
		for(int val : intArray) { // each
			System.out.print(val + ",");
			if(val % 50 == 0) System.out.println();
		}
		System.out.println("\n");
		int [] intArray1 = new int[100];
		for(int idx = 0; idx < intArray1.length ; idx++) {
			intArray1[idx] = intArray[99 - idx];
		}
		/* intArray1[0] = intArray[99];   99 - 0
		 * intArray1[1] = intArray[98];   99 - 1
		 * intArray1[2] = intArray[97];   99 - 2
		 */
		for(int val : intArray1) { // each
			System.out.print(val + ",");
			if(val % 50 == 0) System.out.println();
		}
		
	}

}
