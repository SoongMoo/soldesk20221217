package loop;

public class LoopEx9 {

	public static void main(String[] args) {
		System.out.println(" 6 * 1 = " + 6 * 1);
		System.out.println(" 6 * 2 = " + 6 * 2);
		System.out.println(" 6 * 3 = " + 6 * 3);
		System.out.println(" 6 * 4 = " + 6 * 4);
		System.out.println(" 6 * 5 = " + 6 * 5);
		System.out.println("=====================================");
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 5 * " + j + " = " + 5 * j);
		}
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 6 * " + j + " = " + 6 * j);
		}
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 7 * " + j + " = " + 7 * j);
		}
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		System.out.println("=====================================");
		// 이중 반복문
		for(int dan = 5; dan <= 8 ; dan++ ) {
			for(int j = 1; j <= 9 ; j++) {
				System.out.println(dan + " * " + j + " = " + dan * j);
			}
		}
		System.out.println("=====================================");
		for(int dan = 5; dan <= 8; dan++) {
			for(int gup= 1; gup <= 9 ; gup ++) {
				System.out.println(dan + " * " + gup + " = " + dan * gup);
			}
		}
		System.out.println("=====================================");
		int gup = 1;
		while(gup <= 9) {
			System.out.println("5 * " + gup + " = " + 5 * gup);
			gup++;
		}
		gup = 1;
		while(gup <= 9) {
			System.out.println("6 * " + gup + " = " + 6 * gup);
			gup++;
		}
		gup = 1;
		while(gup <= 9) {
			System.out.println("7 * " + gup + " = " + 7 * gup);
			gup++;
		}
		gup = 1;
		while(gup <= 9) {
			System.out.println("8 * " + gup + " = " + 8 * gup);
			gup++;
		}
		System.out.println("=====================================");
		int dan = 5;
		while(dan <= 8) {
			gup = 1;
			while(gup <= 9) {
				System.out.println(dan + " * " + gup + " = " + dan * gup);
				gup++;
			}
			dan++;
		}
		System.out.println("=====================================");
		for(dan = 5; dan <= 8; dan++) {
			gup = 1;
			while(gup <= 9) {
				System.out.println(dan + " * " + gup + " = " + dan * gup);
				gup++;
			}
		}
	}

}
