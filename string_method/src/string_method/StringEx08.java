package string_method;

public class StringEx08 {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java It CookBook";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println(str1.contains("Java"));
		System.out.println(str2.contains("Java"));
		
		String str3 = "Java Programming";
		int i = 10;
		int j = 20;
		if(i == j) {
			System.out.println("i와 j가 같다.");
		}
		if(str1 == str3) { //  문자열이 저장되어 있는 주소가 같다
			System.out.println("같다");
		}
		
		String str4 = new String("Java Programming");
		System.out.println("str4 : " + str4);
		if(str1 == str4 ) { // 문자열이 저장되어 있는 주소가 다르다.
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str3)) { //문자열을 비교할 경우에는 equeals()라는 메서드를 사용한다.
			System.out.println("str1에 있는 문자열과 str3에 있는 문자열이 같다.");
		}
		if(str1.equals(str4)) {
			System.out.println("str1에 있는 문자열과 str4에 있는 문자열이 같다.");
		}
	}
}