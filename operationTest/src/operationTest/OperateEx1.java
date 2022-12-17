package operationTest;

public class OperateEx1 {
	public static void main(String[] args) {
		//항과 연산자
		//이항 연산자
		System.out.println(10 + 20);
		int i = 10; //대입연산자
		int a,b=10,c=3;
		double d = (double)10 / 3; //3.33333333
		System.out.println(d);
		int result =  10 / 3; // 3 , 몫
		//나머지
		result =  10 % 3; 
		System.out.println(result);
		a=2;
		b=3;
		c=4;
		result = a + b * c;
		System.out.println(result);
		result = (a + b) * c;
		System.out.println(result);
	}
}