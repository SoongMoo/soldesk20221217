package inputOutputText;

import java.io.File;
import java.util.Scanner;

public class InputOutputEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("c:/temp/data1.txt"));
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
