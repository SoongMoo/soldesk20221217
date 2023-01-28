package objectTest;

import java.util.Scanner;

public class ObjectEx01 {

	public static void main(String[] args) {
		int i = 10;
		i = 20;
		Humen sm = new Humen(); // sm : name, age, height, gender
		// sm 객체
		sm.name = "이숭무";
		sm.age = 20;
		sm.height = 175.0;
		sm.gender = 'M';
		System.out.println(i);
		System.out.println(sm.name);
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Humen jb = new Humen();// jb : name, age, height, gender
		// jb 객체
		jb.age = 15;
		jb.gender = 'M';
		jb.height = 193.0;
		jb.name = "이장범";
	}
}

// 변수 : 하나의 값만 저장하는 것
// 배열 : 하나 이상의 값을 저장
// 배열의 단점을 보안 : 하나의 유형을 여러개 저장
// 다른 유형의 값을 여러개 저장할 수 있으면 좋겠다. : class
class Humen{
	String  name;
	int age;
	double height;
	char gender;
}







