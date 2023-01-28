package inputOutputText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputOutputEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
			int ch;
			while((ch = fis.read()) != -1 ) { 
				System.out.print((char)ch);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
