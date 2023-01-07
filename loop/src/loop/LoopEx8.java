package loop;

public class LoopEx8 {
	public static void main(String[] args) {
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================");
		for(int j = 1; j <= 9 ; j+=2) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================");
		for(int j = 1; j <= 9 ; j++) {
			if(j % 2 == 0) continue;
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================");
		for(int j = 1; j <= 9 ; j++) {
			if(j % 2 != 0) continue;
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================");
		int j = 0;
		while(j <= 8 ) {
			j++;
			if(j % 2 == 0) continue;
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================");
		j = 0;
		while(j <= 8 ) {
			j++;
			if(j % 2 != 0) continue;
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		/// for(초기값; 조건식; 증가감식){반복할 명령문}
		/*
		 * 초기값
		 * while(조건식){
		 *   반복할 명령문
		 * 	 증가감식
		 * }
		 */
		// break, continue
	}
}
