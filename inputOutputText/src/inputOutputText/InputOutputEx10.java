package inputOutputText;

import java.io.FileWriter;
import java.util.Scanner;

public class InputOutputEx10 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter(args[0]);
			String str;
			System.out.println("파일을 저장하려면 ^z를 입력하세요...");
			while(!(str = sc.nextLine()).equals("^z")) {
				fw.write(str + "\r\n");
			}
			fw.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
