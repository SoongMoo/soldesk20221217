package string_method;

public class StringEx05 {

	public static void main(String[] args) {
		String str = "Java를 공부하는 중, Java는 재밌어요.*^^*";
		//            012345678 901 23456789 012 3456789
		//                       1         2
		System.out.println("문자열 ===> " + str);
		System.out.println("index 8번에 해당하는 문자 ====> " + str.charAt(8));
		System.out.println();
		System.out.print("제일 처음 나오는 '공'글자의 위치(index) ===> ");
		System.out.println(str.indexOf('공'));
		System.out.print("제일 처음 나오는 Java의 위치(index) ===> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("다음에 나오는 Java의 위치(index) ===> ");
		System.out.println(str.indexOf("Java", 4));
		System.out.print("마지막 나오는 Java의 위치(index) ===> ");
		System.out.println(str.lastIndexOf("Java"));
	}
}
