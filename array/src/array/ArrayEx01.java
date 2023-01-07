package array;

public class ArrayEx01 {// 소스파일

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 20;
		int i4 = 20;
		int i5 = 20;
		
		int [] intArray=new int[5]; // [10][20][30][40][50] : intArray
		                             //  0   1   2   3   4  :index : 요소번호
		intArray[0] = 10;
		intArray[2] = 30;
		System.out.println(intArray[0]);
		System.out.println(intArray[2]);
		System.out.println();
		int intArray1 [] = new int[5]; // 빈배열 : 초기값은 0이 된다.
		int intArray2 [] = {10,20,30,40,50}; // 초가값을 가지는 배열
		System.out.println(intArray1[0]);
		System.out.println(intArray2[0]);
		int intArray3 [] = new int[]{10,20,30,40,50};
	}

}
