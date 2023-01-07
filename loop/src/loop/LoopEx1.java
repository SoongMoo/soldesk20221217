package loop;

public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println(" 8 * 1 = " + 8 * 1);
		System.out.println(" 8 * 2 = " + 8 * 2);
		System.out.println(" 8 * 3 = " + 8 * 3);
		System.out.println(" 8 * 4 = " + 8 * 4);
		System.out.println(" 8 * 5 = " + 8 * 5);
		System.out.println(" 8 * 6 = " + 8 * 6);
		System.out.println(" 8 * 7 = " + 8 * 7);
		System.out.println(" 8 * 8 = " + 8 * 8);
		System.out.println(" 8 * 9 = " + 8 * 9);
		// 같은 명령문을 반복실행 : 반복문
		for(int j = 1; j <= 9 ; j++) {
			System.out.println(" 8 * " + j + " = " + 8 * j);
		}
		int  num = 1;
		for(int j = 0; j <= 8 ; j++) { //반복을 하기 위한 변수
			System.out.println(" 8 * " + num + " = " + 8 * num);
			num++;
		}
		num = 1;
		for(int j = 0; j < 9 ; j++) { //반복을 하기 위한 변수
			System.out.println(" 8 * " + num + " = " + 8 * num);
			num++;
		}
		int i = 0;
		i = i + 1;  // 1
		i = i + 2;  // 3
		i = i + 3;  // 6
		// i = i + ?;
		System.out.println(i);
	}
}
