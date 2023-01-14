package string_method;

public class StringEx02 {

	public static void main(String[] args) {
		String str = "It Cookbook. Java";
		int len;
		len = str.length(); // 문자열의 크기 : 글자의 수
		int size;
		int [] arrayInt = new int[3];
		size = arrayInt.length; // 배열의 크기 , 배열의 크기를 가지고 올때만 length
		System.out.println("len = " + len);
		System.out.printf("size = %d\n" ,  size);
		System.out.printf("str = %s\n", str );
	}
}
