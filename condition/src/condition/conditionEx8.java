package condition;

public class conditionEx8 {
	public static void main(String[] args) {
		
		double num =  Math.random() * 9 ; // 0.00000 ~~~ 0.9999 * 9 // 0.00000 ~ 8.99999
		int rnd = (int)(Math.random() * 9) + 1; // (int)0.00000 ~ 8.99999 : (0 ~ 8) +1:
		int rotto= (int)(Math.random() * 45) + 1; // (int)0.00000 ~ 44.99999 : (0~44) + 1
		System.out.println("rnd =" + rnd);
		if(rnd == 1) {
			System.out.println(" 8 * 1 = " + 8 * 1);
		}else if(rnd == 2) {
			System.out.println(" 8 * 2 = " + 8 * 2 );
		}else if(rnd == 3) {
			System.out.println(" 8 * 3 = " + 8 * 3 );
		}else if(rnd == 4) {
			System.out.println(" 8 * 4 = " + 8 * 4 );
		}else if(rnd == 5) {
			System.out.println(" 8 * 5 = " + 8 * 5 );
		}else if(rnd == 6) {
			System.out.println(" 8 * 6 = " + 8 * 6 );
		}else if(rnd == 7) {
			System.out.println(" 8 * 7 = " + 8 * 7 );
		}else if(rnd == 8) {
			System.out.println(" 8 * 8 = " + 8 * 8 );
		}else{
			System.out.println(" 8 * 9 = " + 8 * 9 );
		}
		switch(rnd){
		case 1: System.out.println(" 8 * 1 = " + 8 * 1);break;
		case 2: System.out.println(" 8 * 2 = " + 8 * 2 );break;
		case 3: System.out.println(" 8 * 3 = " + 8 * 3 );break;
		case 4: System.out.println(" 8 * 4 = " + 8 * 4 );break;
		case 5: System.out.println(" 8 * 5 = " + 8 * 5 );break;
		case 6: System.out.println(" 8 * 6 = " + 8 * 6 );break;
		case 7: System.out.println(" 8 * 7 = " + 8 * 7 );break;
		case 8: System.out.println(" 8 * 8 = " + 8 * 8 );break;
		default: System.out.println(" 8 * 9 = " + 8 * 9 );
		}
	}
}