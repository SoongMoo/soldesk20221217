package operationTest;

public class OperateEx4 {
	public static void main(String[] args) {
		int a =20, b;
		// 후행 연산
		b = a++; // b = a; a++;
		          // b = 20; a = a + 1;
		System.out.println(a);  // 21 
		System.out.println(b);  // 20
		
		// 선행 연산
		a =20;
		b = ++a; // a= a+ 1; b=a;
		//            21      21
		System.out.println(a);  
		System.out.println(b); 
		
		b = --a;
		System.out.println(a);  
		System.out.println(b); 
		b = a--;
		System.out.println(a);  
		System.out.println(b); 
		
		a = 20;
		System.out.println(a = a + 1);
		a = 20;
		System.out.println(a++);
		//System.out.println(a)
		// a= a + 1;
		System.out.println(a);
		a = 20;
		System.out.println(++a);
		System.out.println(a);
		
		a = 10 + 20 * 30;
	//  a = 10 + 600
    //  a = 610
		
		
		int i = a = b = 200;
		//int j = k = 200;
		
		
	}
}
