package condition;

public class conditionEx9 {

	public static void main(String[] args) {
		int score = 79;
		if(score >= 90) { 
			System.out.println("A");
		}else if(score >= 80){      // 89이하 ~ 80
			System.out.println("B");
		}else if(score >= 70){ // 79이하  ~ 70
			System.out.println("c");
		}else if(score >= 60) { // 69 이하 ~ 60
			System.out.println("D");
		}else { // 59 ~ 0
			System.out.println("F");
		}
		switch(score) {
		case 100: case 98: case 96: case 94: case 92: 
		case 90: System.out.println("A"); break;
		case 89: case 84:
		case 87: System.out.println("B");break;
		case 79: case 77:
		case 75: System.out.println("C");break;
		}
	}
}








