package loop;

public class LoopEx2 {

	public static void main(String[] args) {
		System.out.println(" 8 * 9 = " + 8 * 9);
		System.out.println(" 8 * 8 = " + 8 * 8);
		System.out.println(" 8 * 7 = " + 8 * 7);
		System.out.println(" 8 * 6 = " + 8 * 6);
		System.out.println(" 8 * 5 = " + 8 * 5);
		System.out.println(" 8 * 4 = " + 8 * 4);
		System.out.println(" 8 * 3 = " + 8 * 3);
		System.out.println(" 8 * 2 = " + 8 * 2);
		System.out.println(" 8 * 1 = " + 8 * 1);

		for(int i = 9; i >= 1 ; i--) {
			System.out.println(" 8 * " + i + " = " + 8 * i);
		}
		
		for(int i = 1; i <= 9 ; i+=2) {
			System.out.println(" 8 * " + i + " = " + 8 * i);
		}
		
		for(int i = 9; i >= 1 ; i-=2) {
			System.out.println(" 8 * " + i + " = " + 8 * i);
		}
		int sum = 0;
		/*
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		...
		sum = sum + 100;
		*/
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);  // 5050
		
		sum=0; // 0부터 다시 더할려고
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
