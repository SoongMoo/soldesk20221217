package valiableTest;

public class VailableEx6 {

	public static void main(String[] args) {
		int a, b;
		float c, d;
		
		a = 100;
		//b���� a�� ����
		b = a; // �����̶� �����ʿ� �ִ� ���� ���ʿ� �ִ� ��
		System.out.println(b);
		c = 111.11f;
		//d���� c�� ����
		d = c;
		System.out.println(d);
		
		int i = a = b = 30;
		System.out.printf("%d , %d , %d", i,a,b);
	}
}
