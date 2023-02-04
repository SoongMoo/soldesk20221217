package inheritance;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourCalculator a = new FourCalculator();
		a.setData(20, 10);
		int r = a.getAdd();
		System.out.println(r);
		a.setData(0, 10);
		r = a.getDiv();
		System.out.println(r);
		
		a.setData(10, 0); // num1 = 10, num2 = 0;  10/0 ==>불능
		r = a.getDiv();
		System.out.println(r);
		//r = a.getSuperDiv(); //  10/0 ==>불능
	}

}
