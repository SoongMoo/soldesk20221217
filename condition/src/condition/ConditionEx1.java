package condition;

public class ConditionEx1 {

	public static void main(String[] args) {
		// 변수 : 값을 저장하기 위한 문자 
		// 자료형 : 리터널 : 자연인 : 자연어 : 한국, 영어, 일어, 중국
		//                               문자열 : "이숭무", 이숭무(변수)  String
		//                               문자 : '이', 이(변수)         char
		//                     자연수 : 정수 : 10 , "10"(문자열)  byte(1byte), short(2), int(4), long(8)
		//                                실수 : 10.5 , "10.5"(문자열) float(4), double(8)                                    
        //                     형변환 : 자동형변환 : 정수 => 실수
		//                             byte => char => short => int => long => float => double
		//                             강제형변환 : 실수 => 정수
		int a = 10;
		String str = "이숭무";
		char ch = '이';
		double 이 = 10.5;
		char 숭 = '숭';
		String 이숭무 = "이숭무1";  //010-1234-1234
		String i = "10";
		char ii = '1';
		int aaa1 = 10;
		double iii = 10; //자동형변환
		int iiii = (int)10.5; // 강제형변환
		System.out.println(str);	
		System.out.println(ch);
		System.out.println(이);
		System.out.println("10" + 10);
		
		// 연산자 : 2항연산자(사직연산, 대입연산, 비교연산, 논리연산(&&, ||)), 단항연산자(증가감연산 : ++, --)
		//                                boolean       and  or
		int kor = 45;
		boolean b = kor > 60;
		System.out.println(b);
		b = true && false;
		System.out.println(b);
		b = kor > 60 && kor < 30;
		System.out.println(b);
		int eng = 75;
		int mat = 85;
		boolean result = kor >= 60 && eng >= 60 && mat >=60;
		System.out.println(result);
		// condition 조건문
		if(kor >= 60 && eng >= 60 && mat >=60) { // true
			System.out.println("합격");
		}else { // false
			System.out.println("불합격");
		}
		// if(condition){수행명령문}else{수행명령문} // 조건문
		//단일 if : if(condition){수행명령문}
		int a1 = 99;
		if( a > 100) {
			System.out.println("100보다 작군요...!!!");
			System.out.println("거짓이므로 이 문장은 안보입니다.");
		}
		System.out.println("반복문 종료");
		int a2; // 변수 선언
		a2 = 10; // 대입
		//int a2; 같은 이름의 변수를 선언할 수 없다.
		a2 = 200;
		System.out.println(a2);
		if(a2 < 100)// 중괄호가 없는 경우에는 첫번째만 조건문에 해당한다.
			System.out.println("100보다 작군요...!!!");
		
		// 밑에 있는 명령문은 조건에 해당하지 않는다.
		System.out.println("거짓이므로 이 문장은 안보입니다.");
		System.out.println("반복문 종료");
		/// 4년마다 윤년이고 100년마다는 평년이지만 400년 마다는 윤년이다.
		/// 다음 년도는 윤년일까?
		int year = 2300;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}
	}
}







