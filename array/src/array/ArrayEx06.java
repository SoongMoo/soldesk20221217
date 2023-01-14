package array;

public class ArrayEx06 {
	// 소스코드
	public static void main(String[] args) {
		int a1 = 100; // 초기화
		int b2 = 200;
		int a = 100, b=200, c = 300, d =400;
		System.out.println(a);
		int c1; // 변수 선언
		c1 = 300; // 대입
		int [] intArray = new int[4]; 
		int [] intArray1;
		intArray1 = new int[4]; 
		int [] intArray2 = {100,200,300,400}; //배열의 초기화
		int [] intArray3 = new int[] {100,200,300,400}; //배열의 초기화
		int [] intArray4;
		/*intArray4 = {100,200,300,400};*/
		intArray4 = new int[]{100,200,300,400};
		intArray4[0] = 1000;
		int i;
		// System.out.println(i); 변수 i가 초기화가 되지 않아 사용할 수 없다. i=1;
		int intArray5[] = new int[4]; //intArray5[0][1][2][3]
		System.out.println(intArray5[0]); // 배열은 초기화를 하지 않아도 0으로 초기화가 되어 있다.
		for(int idx=0; idx < intArray5.length ; idx++) {
			System.out.println("intArray5["+idx+"] = " + intArray5[idx]);
		}
		
		System.out.println();
		
		for(int idx=0; idx < intArray3.length ; idx++) {
			System.out.println("intArray3["+idx+"] = " + intArray3[idx]);
		}
		
		System.out.println();
		int idx;
		for( idx = 0; idx < intArray2.length ; idx++) {
			System.out.println("intArray2["+idx+"] = " + intArray2[idx]);
		}
		
		for( idx = 0; idx < 3 ; idx++) {
			System.out.println("intArray2["+idx+"] = " + intArray2[idx]);
		}
		
		for( idx = 0; idx < 2 ; idx++) {
			System.out.println("intArray2["+idx+"] = " + intArray2[idx]);
		}
		
		int iii = intArray2[2];
		System.out.println("iii = " + iii);
	}
}