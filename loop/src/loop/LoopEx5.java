package loop;

public class LoopEx5 {
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			System.out.println(" 8 * " + i + " = " + 8 * i);
			i++;
			if(i > 9) break;
		}
	}
}
