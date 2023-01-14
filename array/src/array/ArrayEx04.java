package array;

public class ArrayEx04 {
	public static void main(String[] args) {
		int [] intArray = new int[4];
		int intArray1[] = new int[4];
		int [] intArray2;
		intArray2 = new int[4];
		int intArray3[];
		intArray3 = new int[4];
		/////////////////
		intArray3[0] = 10;
		intArray3[1] = 20;
		intArray3[2] = 30;
		intArray3[3] = 40;
		System.out.println("배열의 크기 : " + intArray3.length); // 4
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		System.out.println(intArray3[3]);
		System.out.println("배열을 반복문을 이용해서 출력");
		for(int idx = 0  ; idx < intArray3.length ; idx++ ) {
			System.out.println(intArray3[idx]);
		}
		int hap=0;
		hap = intArray3[0] + intArray3[1] + intArray3[2] + intArray3[3];
		/* hap = hap + intArray3[0]
		 * hap = hap + intArray3[1]
		 * hap = hap + intArray3[2]
		   hap = hap + intArray3[4]
		 */
		System.out.println("합계1 => : " + hap);
		hap = 0 ;
		//// 반복문 for 이용 /////
		for(int idx = 0 ; idx < 4 ; idx++) {
			hap += intArray3[idx];  // hap = hap + intArray3[idx]
		}
		System.out.println("합계2 => : " + hap);
		//////////////////////   for each ///////////////////////////
		hap = 0;
		for(int i : intArray3) { // 10, 20, 30, 40
			hap += i;
		}
		System.out.println("합계3 => : " + hap);
		//////// while ///////////////////
		int idx = intArray3.length - 1; // 반복 초기값
		hap = 0;
		while(idx >= 0) { // 반복을 하기위한 조건식
			hap += intArray3[idx];
			idx--; // 증가감식
		}
		System.out.println("합계4 => : " + hap);
	}
}
