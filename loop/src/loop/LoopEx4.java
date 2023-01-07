package loop;

public class LoopEx4 {
	public static void main(String[] args) {
		//초기값        조건식     증가식
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=======================================");
		int j = 1;
		for(; j <= 9 ; ) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
			j++;
		}
		System.out.println(j); // 10
		System.out.println("=======================================");
		j = 1; // 초기값
		while( j <= 9  ) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
			j++;
		}
	}
}
