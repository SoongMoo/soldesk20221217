package valiableTest;

public class VailableEx {
	public static void main(String [] args) {
		int i = 10; // integer:����
		// 4byte
		int y = 20;
		int z = i + y;
		float f1 = 10.21f;
		// 4byte
		double d1 = 20.5;
		double d2 = f1 + d1;
		// 8byte
		System.out.println(i + y);
		System.out.println(z);
		System.out.println(d2 );
	}
}


// ��� : ������ �ʴ� ��(��) : ���ͳ�
/*       ���� : ���� : 10, 400 : ������ ���ͳ� : 4byte
 *             �Ǽ� : 10.34, 25.00  : �ü��� ���ͳ� :8byte
 *       ���� : '��' , 'a'  : ������ ���ͳ� : 2byte
 *       ���ڿ� : �̼���,  : ���ڿ��� ���ͳ�
 *       �ο� : true(��)/false(����)*/ // �ο��� ���ͳ� // 1byte
// ���� : ���ϴ� ��(��)
//       ����� ����� �� �ְ� �ϴ� ��
//       i = 10
//       y = 20
//       z = i + y
//       i = 10.55
//       y = 20
//       z = i + y
// �Լ� : f(x, y) = 2x + 3y + 4
//       z = f(3, 4)
//       z = ?



