package valiableTest;

public class VailableEx9 {
	public static void main(String[] args) {
		boolean bl1, bl2; // true/false  �ο�
		bl1 = true; // �ο�
		char ch = 'A'; //����
		String str = "true";//���ڿ�
		System.out.println(bl1);
		System.out.println(str);
		// ��(����)������ �ϴ� ��� �ο�Ÿ���� ����ϰ� �ȴ�.
		boolean result = (10 != 10);
		System.out.println(result);
		String str1 = "�ֵ���ũ";
		String str2 = "10";
		String str3 = "20";
		int i = 10;
		int j = 20;
		System.out.println("i + j = "+ (i + j));
		System.out.println(
				"str2 + str3 = "+ (str2 + str3));
		// ���е�
		float f1 = 0.1234567890123456789012345f;
		double d = 0.1234567890123456789012345;
		System.out.println(f1);
		System.out.println(d);
		
		//�ڵ� ����ȯ
		//byte=>char=>short=>int=>long=>float=>double
		//���� => �Ǽ�
		int ii = (int)10.5; // ��������ȯ
		long l = 10;
		float fff = l;
		System.out.println(fff);
	}
}
