package methodTest;

import java.util.Scanner;

public class MethodEx05 {
	public static int coffee_machine(int button) { // 피 호출 메서드
		System.out.println("1.(자동으로) 뜨거운 물을 준비한다");
		System.out.println("2.(자동으로) 종이컵을 준비한다");
		switch (button) {
		case 1:System.out.println("3.(자동으로) 보통커피를 탄다");break;
		case 2:System.out.println("3.(자동으로) 설탕커피를 탄다");break;
		case 3:System.out.println("3.(자동으로) 블랙커피를 탄다");break;
		}
		System.out.println("4.(자동으로) 물을 붓는다.");
		System.out.println("5.(자동으로) 스푼으로 저어서 녹인다.");
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int coffee;
		int i = 1;
		boolean stop = false;
		while(!stop) {
			System.out.println(i + "번 손님이 들어 오셨습니다.");
			System.out.println("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
			coffee = s.nextInt();
			int res = coffee_machine(coffee);
			System.out.println(i + "번 손님 커피 여기 있습니다.");
			System.out.println();
			
			s.nextLine(); /// 메모리에 남아 있는 \n을 제거하기 위해 한번 실행
			System.out.print("영업이 종료 되었다면 'Y' 또는 'y'를 눌러 주세요 : ");
			String str = s.nextLine();
			if(str.equals("Y") || str.equals("y")) {
				System.out.println("영업을 종료하겠습니다.");
				stop = true;
			}
			i++;
		}
	}

}
