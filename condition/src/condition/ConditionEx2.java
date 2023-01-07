package condition;

public class ConditionEx2 {

	public static void main(String[] args) {
		int year = 2300;
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
			System.out.println("윤년입니다."); // 조건식의 결과 true
		}else {  // // 조건식의 결과 false
			System.out.println("평년입니다.");
		}
		int a = 200;
		if(a < 100) {
			System.out.println("100보다 작군요...!!!");
			System.out.println("참이면 실행되는 명령문");
		}else {   // false
			System.out.println("100보다 크군요...!!!");
			System.out.println("거짓이면 실행되는 명령문");
		}	
	}

}
