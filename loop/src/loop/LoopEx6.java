package loop;

import java.util.Scanner;

public class LoopEx6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		while(true) {
			System.out.printf("출생연도를 입력하세요 : ");
			year = s.nextInt();s.nextLine();
			switch (year % 12) {
			case 0:	System.out.printf("원숭이띠\n");break;
			case 1:	System.out.printf("닭띠\n");break;
			case 2:System.out.printf("개띠\n");break;
			case 3:System.out.printf("돼지띠\n");break;
			case 4:System.out.printf("쥐띠\n");break;
			case 5:System.out.printf("소띠\n");break;
			case 6:	System.out.printf("호랑이띠\n");	break;
			case 7:	System.out.printf("토끼띠\n");break;
			case 8:	System.out.printf("용띠\n");	break;
			case 9:System.out.printf("뱀띠\n");break;
			case 10:System.out.printf("말띠\n");	break;
			case 11:System.out.printf("양띠\n");break;
			}
			System.out.printf("프로그램을 종료하려면 Y또는 y를 누르세요");
			String str = s.nextLine();
			if(str.equals("Y") || str.equals("y")) break;
		}
		System.out.println("프로그램 종료");
	}
}
